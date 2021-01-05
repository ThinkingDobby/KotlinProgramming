package chap03.section3

fun twoLambda(first: (String, String)->String, second: (String)->String) {
    println(first("Hello", "First"))
    println(second("second"))
}

fun main() {
    twoLambda({ a, b -> "It's $a $b" }, { "It's $it" })
    twoLambda({ a, b -> "It's $a $b" }) { "It's $it" }
}