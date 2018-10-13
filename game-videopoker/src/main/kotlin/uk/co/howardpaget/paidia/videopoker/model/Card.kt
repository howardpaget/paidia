package uk.co.howardpaget.paidia.videopoker.model

data class Card (val suit: Suit, val value: CardValue) {
    override fun toString(): String {
        return value.toString() + suit.toString()
    }

    operator fun minus(card: Card): Any {
        return this.value.ordinal - card.value.ordinal
    }
}