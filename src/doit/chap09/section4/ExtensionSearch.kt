package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("c", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    println("elementAt: " + list.elementAt(1))

    println("elementOrElse: " + list.elementAtOrElse(10) { 2 * it })

    println("elementAtOrNull: " + list.elementAtOrNull(10))

    println("first: " + listPair.first { it.second == 200 })
    println("last: " + listPair.last { it.second == 200 })

    println("indexOf: " + list.indexOf(4))
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })
    println("indexOfFirst: " + list.indexOfLast { it % 2 == 0 })
    println("lastIndexOf: " + list.lastIndexOf(5))

    println("single: " + listPair.single { it.second == 100 })
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 })

    println("binarySearch: " + list.binarySearch(3))
    println("find: " + list.find { it > 3 })
}