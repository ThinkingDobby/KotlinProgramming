package chap08.section2
// 메서드 체이닝, map
fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}