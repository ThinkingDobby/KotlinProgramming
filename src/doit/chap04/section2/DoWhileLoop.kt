package chap04.section2

fun main() {
    do {
        print("Enter the number: ")
        val num = readLine()!!.toInt()

        for (i in 0..(num-1)) {
            for (j in 0..(num-1)) print((i + j) % num + 1)
            println()
        }
    } while (num != 0)
}