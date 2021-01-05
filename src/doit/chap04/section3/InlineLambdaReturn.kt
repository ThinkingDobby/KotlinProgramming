package chap04.section3

fun main() {
    retFunc()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of retFunc")
    inlineLambda(13, 3) { a, b ->
        val result = a + b
        if (result > 10) return     // 비지역 반환 발생
        println("result: $result")
    }
    println("end of retFunc")
}