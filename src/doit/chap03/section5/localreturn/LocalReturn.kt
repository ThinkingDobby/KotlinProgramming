package chap03.section5.localreturn

fun main() {
    shortFunc(3) {
        println("First Call: $it")
        return
    }
}

inline fun shortFunc(a: Int, out: (Int)->Unit) {
    println("Before out()")
    out(a)
    println("After out()")
}