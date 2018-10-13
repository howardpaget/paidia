package co.uk.howardpaget.paidia

import co.uk.howardpaget.paidia.state.State

interface Game {
    fun play(state: State): String
}