package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = br.readLine()

    var cnt = 1
    for (i in arr) {
        if (i == ' ') cnt++
    }

    if (arr.first() == ' ') cnt--
    if (arr.last() == ' ') cnt--

    bw.write("$cnt")
    bw.flush()
    bw.close()
}