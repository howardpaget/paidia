package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Card
import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand
import uk.co.howardpaget.paidia.videopoker.model.Suit
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RoyalFlushTest {

    private val rule = RoyalFlush()

    @Test
    fun royalFlushTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Jack),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Spades, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(true, rule.checkHand(hand))
    }

    @Test
    fun notRoyalFlushTest1() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Jack),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }

    @Test
    fun notRoyalFlushTest2() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Eight),
                Card(Suit.Spades, CardValue.Jack),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Spades, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }
}