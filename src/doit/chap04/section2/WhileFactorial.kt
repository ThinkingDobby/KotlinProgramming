package chap04.section2

fun main() {
    print("Enter the number: ")
    var num = readLine()!!.toInt()

    var factorial = 1

    while (num > 0) {
        factorial *= num
        num--
    }

    println("Factorial: $factorial")
}