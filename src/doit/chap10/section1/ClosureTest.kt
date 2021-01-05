package chap10.section1

fun main() {
    val calc = Calc()
    var result = 0
    calc.addNum(2, 3){x, y -> result = x + y}
    println(result)

    fun filteredNames(length: Int) {
        val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
        val filterResult = names.filter {
            it.length == length
        }
        println(filterResult)
    }

    filteredNames(4)
}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}