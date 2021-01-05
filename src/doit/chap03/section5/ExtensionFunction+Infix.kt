package chap03.section5

fun main() {
    val source = "Hello World"
    val target = "Kotlin"

    println(source getShortString target)
}

infix fun String.getShortString(target: String):String =
        if(this.length < target.length) this else target