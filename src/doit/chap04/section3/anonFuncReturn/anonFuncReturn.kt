package chap04.section3.anonFuncReturn

fun main() {
    retFunc()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFunc() {
    println("Start of retFunc()")
    inlineLambda(13, 3, fun(a, b) {     // 익명함수 사용 시 암묵적 라벨 사용 결과와 동일
        val result = a + b                    // 가장 가까운 함수만 반환
        if (result > 10) return
        println("result: $result")
    })
    println("End of retFunc()")
}
