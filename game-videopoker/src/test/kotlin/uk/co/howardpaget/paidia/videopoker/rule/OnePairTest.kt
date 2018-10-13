package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Card
import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand
import uk.co.howardpaget.paidia.videopoker.model.Suit
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OnePairTest {

    private val rule = OnePair()

    @Test
    fun twoPairTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Clubs, CardValue.Ten),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.Five),
                Card(Suit.Diamonds, CardValue.Two)))

        Assertions.assertEquals(true, rule.checkHand(hand))
    }

    @Test
    fun notTwoPairTest1() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Clubs, CardValue.Ten),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.Queen),
                Card(Suit.Diamonds, CardValue.Two)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }

    @Test
    fun notTwoPairTest2() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Jack),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }
}