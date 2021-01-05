package doit.chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i")
                delay(500L)
            }
        } finally {
            withContext(NonCancellable) {
                delay(1000L)
                println("Bye")
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin()
    println("main: Quit!")
}
