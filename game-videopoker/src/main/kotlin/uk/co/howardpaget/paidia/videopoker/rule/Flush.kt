package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand

class Flush : Rule {
    override fun checkHand(hand: Hand): Boolean {
        return hand.cards.all { card -> card.suit == hand.cards[0].suit }
    }
}