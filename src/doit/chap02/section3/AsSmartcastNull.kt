package chap02.section3

fun main() {
    val y: Int? = null
    val x: String? = y as? String

    println(y)
}