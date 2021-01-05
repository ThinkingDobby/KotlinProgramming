package chap02.section3

fun main() {
    val x: Any
    x = "Hello"
    if (x is String) {
        print(x.length)
    }
}