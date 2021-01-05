package practice.baekjoon.section11

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()


    var num = 0

    while (n > 0) {
        num++
        val str = num.toString()
        if (str.contains("666")) n--
    }

    bw.write("$num")

    bw.flush()
    bw.close()
}