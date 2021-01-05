package doit.chap11.section2

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println(2)
    }
    println(1)
}
