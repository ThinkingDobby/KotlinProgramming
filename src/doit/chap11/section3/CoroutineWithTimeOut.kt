package doit.chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    try {
        withTimeout(1300L) {
            repeat(1000) {
                println("I'm sleeping $it ...")
                delay(500L)
            }
        }
    } catch (e: TimeoutCancellationException) {
        println("timed out with $e")
    }
}