package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Card
import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand
import uk.co.howardpaget.paidia.videopoker.model.Suit
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StraightFlushTest {

    private val rule = StraightFlush()

    @Test
    fun straightTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Jack),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Spades, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(true, rule.checkHand(hand))
    }

    @Test
    fun straightTest2() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Five),
                Card(Suit.Spades, CardValue.Seven),
                Card(Suit.Spades, CardValue.Six),
                Card(Suit.Spades, CardValue.Eight),
                Card(Suit.Spades, CardValue.Nine)))

        Assertions.assertEquals(true, rule.checkHand(hand))
    }

    @Test
    fun notStraightTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Two),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }
}