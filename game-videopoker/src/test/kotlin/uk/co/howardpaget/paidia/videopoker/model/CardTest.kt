package uk.co.howardpaget.paidia.videopoker.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CardTest {

    @Test
    fun cardTest1() {
        val card = Card(Suit.Spades, CardValue.Jack)

        Assertions.assertEquals(card, Card.fromString(card.toString()))
    }

    @Test
    fun cardTest2() {
        val card = Card(Suit.Spades, CardValue.Ten)

        Assertions.assertEquals(card, Card.fromString(card.toString()))
    }
}