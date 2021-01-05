package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    println(list.map { it * 2 })

    val mapIndexed = list.mapIndexed { index, it -> index * 2 }
    println(mapIndexed)

    println(listWithNull.mapNotNull { it?.times(2) })

    println()

    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    println()

    val grpMap = list.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(grpMap)
}