package doit.chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val jobs = arrayListOf<Job>()
    jobs += launch(Dispatchers.Unconfined) {
        println("Unconfined: ${Thread.currentThread().name}")
    }
    jobs += launch(coroutineContext) {
        println("coroutineContext: ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default) {
        println("Default: ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.IO) {
        println("IO: ${Thread.currentThread().name}")
    }
    jobs += launch {
        println("main runBlocking: ${Thread.currentThread().name}")
    }
    jobs.forEach { it.join() }
}