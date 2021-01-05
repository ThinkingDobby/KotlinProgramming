package chap04.section3.lambdaAndAnonFunc

fun main() {
    val getMessage = lambda@{ num: Int ->
        if (num !in 1..100) {
            return@lambda "Error"   // 라벨 표기시 가독성 떨어짐
        }
        "Success"
    }

    val result = getMessage(6)
    println("result = $result")
}