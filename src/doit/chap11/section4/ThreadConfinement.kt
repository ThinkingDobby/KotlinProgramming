package doit.chap11.section4

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

val counterContext = newSingleThreadContext("CounterContext")
var counter2 = 0

suspend fun massiveRun2(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(n) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking<Unit> {
    massiveRun2(counterContext) {
        counter2++
    }
    println("Counter = $counter2")
}