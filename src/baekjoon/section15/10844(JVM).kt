package practice.baekjoon.section14

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var tmp = 1
    repeat(n) {
        tmp *= 10
    }

    var cnt = 0
    if (n == 1) cnt += 9
    for (i in 1 until tmp) {
        val num = i.toString()
        for (j in 0 until num.length - 1) {
            if (!(num[j] == num[j + 1] + 1 || num[j] == num[j + 1] - 1)) break
            if (j + 1 == n - 1) cnt++
        }
    }

    bw.write("${cnt % 1000000000}")

    bw.flush()
    bw.close()
}