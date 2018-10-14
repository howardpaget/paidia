package uk.co.howardpaget.paidia

import uk.co.howardpaget.paidia.videopoker.VideoPoker
import uk.co.howardpaget.paidia.state.State

fun main(args: Array<String>) {
    val game : Game = VideoPoker()
    val state = State()

    println(game.play(state))

    println(game.play(state))

    state.putValue("request", readLine().orEmpty())
    println(game.play(state))
}