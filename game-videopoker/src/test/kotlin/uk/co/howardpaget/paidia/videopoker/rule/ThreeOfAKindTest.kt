package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Card
import uk.co.howardpaget.paidia.videopoker.model.CardValue
import uk.co.howardpaget.paidia.videopoker.model.Hand
import uk.co.howardpaget.paidia.videopoker.model.Suit
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ThreeOfAKindTest {

    private val rule = ThreeOfAKind()

    @Test
    fun threeOfAKindTest() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Clubs, CardValue.Ten),
                Card(Suit.Diamonds, CardValue.Ten),
                Card(Suit.Hearts, CardValue.Eight),
                Card(Suit.Diamonds, CardValue.Two)))

        Assertions.assertEquals(true, rule.checkHand(hand))
    }

    @Test
    fun notThreeOfAKindTests() {
        val hand = Hand(listOf(Card(Suit.Spades, CardValue.Ten),
                Card(Suit.Diamonds, CardValue.Ten),
                Card(Suit.Spades, CardValue.Queen),
                Card(Suit.Clubs, CardValue.King),
                Card(Suit.Spades, CardValue.Ace)))

        Assertions.assertEquals(false, rule.checkHand(hand))
    }
}