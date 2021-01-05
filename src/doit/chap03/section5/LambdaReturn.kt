package chap03.section5

fun main() {
    val lambda = label@{x:Int, y:Int -> return@label}

    println("result: $lambda")
}