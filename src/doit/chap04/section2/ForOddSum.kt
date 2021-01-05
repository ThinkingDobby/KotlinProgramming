package chap04.section2

fun main() {
    var oddSum = 0
    var evenSum = 0

    for (i in 1..100 step 2) oddSum += i
    for (i in 0..100 step 2) evenSum += i

    println("Odd Sum: $oddSum")
    println("Even Sum: $evenSum")
}