package practice

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayOf(3, 2 ,1)
    arr.sort(0, 2)

    arr.forEach { println(it) }
}