package chap09.section3

fun main() {
    val mixedTypeSet = setOf("Hello", 4, "world", 3.15, 'c')
    val intSet: Set<Int> = setOf<Int>(1, 5, 5)

    println(mixedTypeSet)
    println(intSet)
}