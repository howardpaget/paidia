package co.uk.howardpaget.paidia.videopoker.rule

import co.uk.howardpaget.videopoker.model.Card

interface Rule {
 fun checkHand(cards: List<Card>): Boolean
}