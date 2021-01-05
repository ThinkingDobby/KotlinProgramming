package chap04.section2

fun main() {
    print("Enter the lines: ")
    val line = readLine()!!.toInt()

    for (now in 1..line) {
        for (space in 1 until (line - now + 1)) print(" ")
        for (star in 1 until (2 * now)) print("*")
        println()
    }
}