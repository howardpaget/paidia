package uk.co.howardpaget.paidia.videopoker

import sun.plugin.dom.exception.InvalidStateException
import uk.co.howardpaget.paidia.Game
import uk.co.howardpaget.paidia.state.State
import uk.co.howardpaget.paidia.videopoker.model.*
import uk.co.howardpaget.paidia.videopoker.rule.RuleSet
import java.security.SecureRandom

private const val IS_COMPLETE = "isComplete"
private const val HAND = "hand"
private const val REQUEST = "request"

private const val HAND_SIZE = 5

class VideoPoker : Game {
    private val deck: List<Card>
    private val random = SecureRandom()

    init {
        val deck = mutableListOf<Card>()
        for (v in CardValue.values()) {
            for (s in Suit.values()) {
                deck.add(Card(s, v))
            }
        }
        this.deck = deck
    }

    private fun createRandomHand(): Hand {
        val hand = mutableSetOf<Card>()
        do {
            hand.add(deck[random.nextInt(deck.size)])
        } while (hand.size < HAND_SIZE)
        return Hand(hand.toList())
    }

    private fun replaceHolds(hand: Hand, hold: Hold): Hand {
        val newHand = mutableSetOf<Card>()
        newHand.addAll(hold.holdPositions)

        do {
            val card = deck[random.nextInt(deck.size)]
            if (!hand.cards.contains(card)) {
                newHand.add(card)
            }
        } while (newHand.size < HAND_SIZE)
        return Hand(newHand.toList())
    }

    override fun isComplete(state: State): Boolean {
        return state.getBoolean(IS_COMPLETE)
    }

    override fun play(state: State): String {
        if (state.isEmpty()) {
            val hand = createRandomHand()
            state.putValue(HAND, hand.toString())

            val response = StringBuilder()

            response.appendln("Hand: $hand")
            response.append("Input hold pattern e.g. H_H__ to hold the 1st and 3rd cards")

            return response.toString()
        } else {
            if(!state.containsKey(REQUEST)){
                return "No request"
            }

            val hand = Hand.fromString(state.getString(HAND))

            val hold = Hold(state.getString(REQUEST)
                    .mapIndexed { index, c -> if (c == 'H') index else  -1 }
                    .filter { i -> i != -1 }
                    .map { i -> hand.cards[i] })

            val newHand = replaceHolds(hand, hold)

            val response = StringBuilder()

            response.appendln("Holding: $hold")
            response.appendln("New hand: $newHand")

            val rule = RuleSet.defaultRuleSet().checkHand(newHand)

            if(rule == null){
                response.appendln("No win")
            } else {
                response.appendln(rule.toString())
            }

            return response.toString()
        }
        // throw InvalidStateException("something has gone wrong")
    }
}