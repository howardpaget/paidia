package uk.co.howardpaget.paidia.videopoker.model

data class Card(val suit: Suit, val value: CardValue) {
    override fun toString(): String {
        return value.toString() + suit.toString()
    }

    operator fun minus(card: Card): Any {
        return this.value.ordinal - card.value.ordinal
    }

    companion object Factory {
        fun fromString(str: String): Card {
            if (str.length == 3) {
                return Card(Suit.fromString(str.substring(2)), CardValue.fromString(str.substring(0, 2)))
            }

            return Card(Suit.fromString(str.substring(1, 2)), CardValue.fromString(str.substring(0, 1)))
        }
    }
}