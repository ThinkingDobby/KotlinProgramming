package chap04.section3.lambdaAndAnonFunc

fun main() {
    val getText = fun(num: Int): String {
        if (num !in 1..100) {
            return "Error"
        }
        return "Success"    // 알아보기 쉬운 표기 - 두 개의 return 확실히 구별
    }

    val result = getText(6)
    println("result = $result")
}