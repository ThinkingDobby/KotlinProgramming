package chap03.section5

fun main() {
    chap03.section5.noinline.shortFunc(3) { println("First Call: $it") }
    chap03.section5.noinline.shortFunc(5) { println("Second Call:$it") }
}

inline fun shortFunc(a:Int, out: (Int)->Unit) {
    println("Before Out()")
    out(a)
    println("After Out()")
}