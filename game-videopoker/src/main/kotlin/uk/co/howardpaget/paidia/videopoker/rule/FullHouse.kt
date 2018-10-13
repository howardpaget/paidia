package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand

class FullHouse : Rule {
    override fun checkHand(hand: Hand): Boolean {
        return CardValue.values().map { value -> hand.cards.filter { card -> card.value == value }.count() }.filter { count -> count == 2 }.count() == 1 &&
                return CardValue.values().map { value -> hand.cards.filter { card -> card.value == value }.count() }.filter { count -> count == 3 }.count() == 1
    }
}