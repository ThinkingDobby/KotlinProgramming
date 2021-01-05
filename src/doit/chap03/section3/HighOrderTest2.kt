package chap03.section3

fun highorder(sum: (Int,Int) -> Int, a: Int, b:Int) = sum(a,b)

fun main() {
    val result: Int
    result = highorder({ x, y -> x + y }, 10, 20)
    println("result: $result")
}