package chap04.section1

fun main() {

    print("Input score: ")
    val score = readLine()!!.toDouble()

    val grade = if (score >= 90 && score <= 100) {
        'A'
    } else if (score >= 80.0) {
        'B'
    } else if (score >= 70.0) {
        'C'
    } else {
        'F'
    }

    println("grade: $grade")

}
