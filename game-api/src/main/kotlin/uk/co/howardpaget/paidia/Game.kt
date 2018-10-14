package uk.co.howardpaget.paidia

import uk.co.howardpaget.paidia.state.State

interface Game {
    fun play(state: State): String
    fun isComplete(state: State): Boolean
}