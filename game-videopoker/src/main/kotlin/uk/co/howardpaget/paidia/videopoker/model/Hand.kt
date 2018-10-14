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

    override fun toString(): String {
        return cards.map { card -> card.toString() }.reduce { str, card -> "$str,$card" }
    }

    companion object Factory {
        fun fromString(str: String): Hand {
            val cardStrs = str.split(",")
            return Hand(cardStrs.map { s -> Card.fromString(s) })
        }
    }

    override fun equals(other: Any?): Boolean {
        if(other == null) {
            return false
        }

        if(other is Hand){
            return cards.containsAll(other.cards)
        }

        return false
    }
}