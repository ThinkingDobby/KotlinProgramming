package chap04.section3

fun main() {
    labelContinue()
}

fun labelContinue() {
    println("labelContinue")
    first@for (i in 1..5) {
        second@for (j in 1..5) {
            if (j == 3) continue@first
            println("i: $i, j: $j")
        }
        println("After for j")
    }
    println("After for i")
}