package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()
    var sum = 0

    repeat(n) {
        sum += input[it].toInt() - 48
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}