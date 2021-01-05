package practice.baekjoon.section2

fun main() {
    val input = readLine()!!.split(" ")
    val h = input[0].toInt()
    val m = input[1].toInt()

    var totalMin = h * 60 + m

    if (totalMin < 45) totalMin += 1395
    else totalMin -= 45

    val newHour = totalMin / 60
    val newMin = totalMin % 60

    println("$newHour $newMin")
}