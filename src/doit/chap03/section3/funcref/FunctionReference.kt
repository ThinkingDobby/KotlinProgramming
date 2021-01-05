package chap03.section3.funcref

fun sum(a: Int, b: Int) = a + b
fun text(a: String, b: String) = "Hi! $a $b"
fun funcParam(a: Int, b: Int, c: (Int, Int)->Int) =c(a,b)
fun hello(body: (String, String)->String) = println(body("Hello", "World"))

fun main() {
    val result = funcParam(10, 20, ::sum)   // 일반함수를 람다식처럼 사용
    println(result)

    hello(::text)
    hello({a,b->text(a,b)})
    hello{a,b->text(a,b)}

    val likeLambda = ::sum
    println(likeLambda(10,20))
}