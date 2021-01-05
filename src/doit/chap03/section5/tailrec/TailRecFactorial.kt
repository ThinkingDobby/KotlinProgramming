package chap03.section5.tailrec

fun main() {
    val number = 5
    val result = factorial(number)

    println(result)
}

tailrec fun factorial(n: Int, run: Int=1):Long = if(n==0) run.toLong() else factorial(n-1,n*run)