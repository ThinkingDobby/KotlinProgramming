package practice

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"

    println(getLongString(source, target))
}

fun getLongString(a: String, b: String): String = if(a.length>b.length) a else b