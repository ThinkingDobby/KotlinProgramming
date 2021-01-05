package practice.baekjoon.section8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var min = (n / 3 + 2) * 2
    var ans: Int

    for (i in 0..n / 3 + 1) {
        for (j in 0..n / 3 + 1) {
            if (3 * i + 5 * j == n) if (i + j < min) min = i + j
            if (5 * i + 3 * j == n) if (i + j < min) min = i + j
        }
    }

    ans = if (min == (n / 3 + 2) * 2) -1
    else min

    bw.write("$ans")
    bw.flush()
    bw.close()
}