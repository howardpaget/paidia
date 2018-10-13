package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Hand

class RuleSet(val rules: List<Rule>) {
    fun checkHand(hand: Hand): Rule? {
        for (i in 0..rules.size) {
            if(rules[i].checkHand(hand))
                return  rules[i]
        }
        return null
    }
}