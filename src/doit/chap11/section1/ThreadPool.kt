package doit.chap11.section1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val myService: ExecutorService = Executors.newFixedThreadPool(8)
    var i = 0

    val items = Array(10) {
        readLine()
    }

    while (i < items.size) {
        val item = items[i]
        myService.submit {
            processItem(item!!)
        }
        i += 1
    }
}

fun processItem(item: String) {
    println(item)
}