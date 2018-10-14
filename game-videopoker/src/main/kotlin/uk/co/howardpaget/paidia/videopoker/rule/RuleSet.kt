package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Hand

class RuleSet(private val rules: List<Rule>) {
    fun checkHand(hand: Hand): Rule? {
        for (rule in rules) {
            if (rule.checkHand(hand))
                return rule
        }
        return null
    }

    companion object Factory {
        fun defaultRuleSet(): RuleSet {
            return RuleSet(listOf(RoyalFlush(), StraightFlush(), FourOfAKind(), FullHouse(), Flush(), Straight(), ThreeOfAKind(), TwoPair(), OnePair()))
        }
    }
}