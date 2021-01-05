package chap03.section3

fun main() {
    val result = callByName(otherlambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("callByName Function")
    return b()
}

val otherlambda: ()-> Boolean = {
    println("otherlambda Function")
    true
}