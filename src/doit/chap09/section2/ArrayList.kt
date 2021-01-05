package chap09.section2

fun main() {
    val stringList: ArrayList<String> = arrayListOf("Hello", "Kotlin", "Wow")
    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}