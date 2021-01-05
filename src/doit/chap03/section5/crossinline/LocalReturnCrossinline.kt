package chap03.section5.crossinline

fun main() {
    shortFunc(3) {
        println("First Call: $it")
        // return 사용불가
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int)->Unit) {
    println("Before out()")
    nestedFunc{out(a)}      // 인라인함수 내 람다식이 다른 함수에 의해 중복될 경우 crossinline 키워드 사용
    println("After out()")
}

fun nestedFunc(body: ()->Unit) {
    body()
}