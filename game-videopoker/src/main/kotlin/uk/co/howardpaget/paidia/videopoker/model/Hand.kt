package uk.co.howardpaget.paidia.videopoker.model

import java.lang.IllegalArgumentException

class Hand(cards: List<Card>) {
    val cards: List<Card>

    init {
        if (cards.size != 5) {
            throw IllegalArgumentException("cards must be of length 5")
        }

        if (cards.distinct().count() != 5) {
            throw IllegalArgumentException("cards cannot contain duplicates")
        }

        this.cards = cards.sortedWith(compareBy({ it.value }, { it.suit }))
    }
}