package practice.baekjoon.section2

fun main() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    val quadrant  = when {
        x > 0 && y > 0 -> 1
        x < 0 && y > 0 -> 2
        x < 0 && y < 0 -> 3
        x > 0 && y < 0 -> 4
        else -> 0
    }

    println(quadrant)
}