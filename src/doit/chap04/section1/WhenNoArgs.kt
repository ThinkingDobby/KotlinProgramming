package chap04.section1

fun main() {

    print("Input score: ")
    val score = readLine()!!.toDouble()

    val grade = when {
        score in 90.0..100.0-> 'A'
        score in 80.0..89.9 -> 'B'
        score in 70.0..79.9 -> 'C'
        score < 70.0 -> 'F'
        else -> "Error"
    }

    println("grade: $grade")

}