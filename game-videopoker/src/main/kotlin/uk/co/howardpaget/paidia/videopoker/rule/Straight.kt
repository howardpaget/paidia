package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand

class Straight : Rule {
    override fun checkHand(hand: Hand): Boolean {
        return listOf(0, 1, 2, 3).all { i -> hand.cards[i + 1] - hand.cards[i] == 1} ||
                listOf(1, 2, 3).all { i -> hand.cards[i + 1] - hand.cards[i] == 1} && hand.cards[0].value == CardValue.Ace && hand.cards[4].value == CardValue.King
    }
}