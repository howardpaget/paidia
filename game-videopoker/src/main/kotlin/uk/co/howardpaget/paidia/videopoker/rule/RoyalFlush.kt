package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand

class RoyalFlush : Rule {
    override fun checkHand(hand: Hand): Boolean {
        return hand.cards.any { card -> card.value == CardValue.Ten } &&
                hand.cards.any { card -> card.value == CardValue.Jack } &&
                hand.cards.any { card -> card.value == CardValue.Queen } &&
                hand.cards.any { card -> card.value == CardValue.King } &&
                hand.cards.any { card -> card.value == CardValue.Ace } &&
                hand.cards.all { card -> card.suit == hand.cards[0].suit }
    }
}