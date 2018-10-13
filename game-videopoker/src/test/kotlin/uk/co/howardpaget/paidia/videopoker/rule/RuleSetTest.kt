package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Card
import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand
import uk.co.howardpaget.paidia.videopoker.model.Suit
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RuleSetTest {

    private val ruleSet = RuleSet(listOf(RoyalFlush(), StraightFlush(), FourOfAKind(), FullHouse(), Flush(), Straight(), ThreeOfAKind(), TwoPair(), OnePair()))

    @Test
    fun flushTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Two),
                Card(Suit.Spades, CardValue.Eight),
                Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Three),
                Card(Suit.Spades, CardValue.Jack)))

        Assertions.assertEquals(true, ruleSet.checkHand(hand) is Flush)
    }

    @Test
    fun onePairTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Two),
                Card(Suit.Diamonds, CardValue.Two),
                Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Spades, CardValue.Three),
                Card(Suit.Spades, CardValue.Jack)))

        Assertions.assertEquals(true, ruleSet.checkHand(hand) is OnePair)
    }
}