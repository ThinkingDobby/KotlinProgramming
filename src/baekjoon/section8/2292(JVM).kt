package practice.baekjoon.section8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var cnt = 1

    if (n == 1) cnt = 0
    else while (true) {
        if (2 + 3 * cnt * (cnt + 1) > n) break
        cnt++
    }

    bw.write("${cnt + 1}")
    bw.flush()
    bw.close()
}