package chap04.section1

fun main(){
    print("Input score: ")
    val score = readLine()!!.toDouble()

    val grade = if(score in 90.0..100.0) {
        'A'
    } else if (score in 80.0..89.9) {
        'B'
    } else if (score in 70.0..79.9) {
        'c'
    } else {
        'F'
    }

    println("grade: $grade")

}