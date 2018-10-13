package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand

class FourOfAKind : Rule {
    override fun checkHand(hand: Hand): Boolean {
        return CardValue.values().map { value -> hand.cards.filter { card -> card.value == value }.count() }.filter { count -> count == 4 }.count() == 1
    }
}