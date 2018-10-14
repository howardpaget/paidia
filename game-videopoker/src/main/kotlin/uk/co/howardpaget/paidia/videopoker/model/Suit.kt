package uk.co.howardpaget.paidia.videopoker.model

import java.lang.IllegalArgumentException

enum class Suit(private val suit: String) {
    Hearts("♥"),
    Spades("♠"),
    Clubs("♣"),
    Diamonds("♦");

    override fun toString(): String {
        return suit
    }

    companion object Factory {
        fun fromString(str: String): Suit {
            return values().firstOrNull { suit -> suit.toString() == str }
                    ?: throw IllegalArgumentException("$str is not a valid suit")
        }
    }
}