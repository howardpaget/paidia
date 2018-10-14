package uk.co.howardpaget.paidia.videopoker.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HandTest {

    @Test
    fun handToStringTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Two),
                Card(Suit.Hearts, CardValue.Eight),
                Card(Suit.Clubs, CardValue.Ten),
                Card(Suit.Diamonds, CardValue.Three),
                Card(Suit.Spades, CardValue.Jack)))

        Assertions.assertEquals("2♠,3♦,8♥,10♣,J♠", hand.toString())
    }

    @Test
    fun handFromStringTest2() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Two),
            Card(Suit.Hearts, CardValue.Eight),
            Card(Suit.Clubs, CardValue.Ten),
            Card(Suit.Diamonds, CardValue.Three),
            Card(Suit.Spades, CardValue.Jack)))

        Assertions.assertEquals(hand, Hand.fromString(hand.toString()))
    }
}