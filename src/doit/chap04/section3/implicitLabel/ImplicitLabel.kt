package chap04.section3.implicitLabel

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) return@inlineLambda    // 암묵적 라벨(Implicit Label)
        println("result: $result")
    }
    println("End of retFunc")
}