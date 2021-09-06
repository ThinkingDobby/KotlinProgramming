package practice

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val tmp = "hobby"
    println(tmp.count{it == 'b'})
    println(tmp.indexOf('y'))
    println(tmp.toCharArray().joinToString(","))
    println(tmp.toUpperCase())

    val tmp2 = "  HI  "
    println(tmp2.trim())
    println(tmp2.replace("HI", "Hello"))

    val tmp3 = mutableListOf(1, 2, 3, 4)
    tmp3.add(5)
    tmp3.add(0, 4)
    println(tmp3)
    tmp3.remove(4)
    println(tmp3)

    val tmp4 = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    println(tmp4.keys)
    println(tmp4.values)
    for ((k, v) in tmp4) {
        println("$k $v")
    }

    val tmp5 = mutableListOf(1, 2, 3, 4, 5)
    val tmp6 = tmp5.toMutableList()
    tmp6[0] = 7
    println(tmp5)
    println(tmp6)

    val tmp7 = listOf({a: Int, b: Int -> a + b}, {a: Int, b: Int -> a - b})
    println(tmp7[0](2, 3))
    println(tmp7[1](5, 4))
}