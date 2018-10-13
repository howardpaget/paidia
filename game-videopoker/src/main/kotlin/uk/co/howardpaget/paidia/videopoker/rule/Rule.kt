package uk.co.howardpaget.paidia.videopoker.rule

import uk.co.howardpaget.paidia.videopoker.model.Hand

interface Rule {
    fun checkHand(hand: Hand): Boolean
}