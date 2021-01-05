package doit.chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.system.measureTimeMillis

val mutex = Mutex()
var counter3 = 0

suspend fun massiveRun3(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(n) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking<Unit> {
    massiveRun3 {
        mutex.withLock {
            counter3++
        }
    }
    println("Counter = $counter3")
}