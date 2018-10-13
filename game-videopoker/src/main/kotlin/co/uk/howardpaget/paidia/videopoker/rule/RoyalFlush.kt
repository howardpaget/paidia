package co.uk.howardpaget.paidia.videopoker.rule

import co.uk.howardpaget.videopoker.model.Card
import co.uk.howardpaget.videopoker.model.CardValue
import com.sun.javaws.exceptions.InvalidArgumentException

class RoyalFlush : Rule {
    override fun checkHand(cards: List<Card>): Boolean {
        if (cards.size != 5) throw InvalidArgumentException(Array(1) { "Hand must be of size 5" })

        return cards.any { card -> card.value == CardValue.Ten } &&
                cards.any { card -> card.value == CardValue.Jack } &&
                cards.any { card -> card.value == CardValue.Queen } &&
                cards.any { card -> card.value == CardValue.King } &&
                cards.any { card -> card.value == CardValue.Ace } &&
                cards.all { card -> card.suit == cards[0].suit }
    }
}