package uk.co.howardpaget.paidia.videopoker.model

enum class CardValue(private val value: String) {
    Ace("A"),
    Two("2"),
    Three("3"),
    Four("4"),
    Five("5"),
    Six("6"),
    Seven("7"),
    Eight("8"),
    Nine("9"),
    Ten("10"),
    Jack("J"),
    Queen("Q"),
    King("K");

    override fun toString(): String {
        return value
    }
}