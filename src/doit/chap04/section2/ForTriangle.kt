package chap04.section2

fun main() {
    print("Enter the lines: ")
    val line = readLine()!!.toInt()

    for (now in 1..line) {
        for (star in 1..(line - now)) print(" ")
        for (space in 1..(2 * now - 1)) print("*")
        println()
    }
}