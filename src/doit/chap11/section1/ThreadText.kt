package doit.chap11.section1

class SimpleRunnable: Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    object : Thread() {
        override fun run() {
            println("Current Thread(object): ${Thread.currentThread()}")
        }
    }.start()

    Thread {
        println("Current Threads(lambda): ${Thread.currentThread()}")
    }.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()
}