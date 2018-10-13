package co.uk.howardpaget.paidia.videopoker.model

enum class Suit(private val suit: String) {
    Hearts("♥"),
    Spades("♠"),
    Clubs("♣"),
    Diamonds("♦");

    override fun toString(): String {
        return suit
    }
}