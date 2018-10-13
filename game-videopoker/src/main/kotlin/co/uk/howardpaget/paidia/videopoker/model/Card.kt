package co.uk.howardpaget.paidia.videopoker.model

data class Card (val suit: Suit, val value: CardValue) {
    override fun toString(): String {
        return value.toString() + suit.toString()
    }
}