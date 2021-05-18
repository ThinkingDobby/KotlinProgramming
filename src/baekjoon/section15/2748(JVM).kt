package practice.baekjoon.section14

import java.io.*

lateinit var arr: Array<Long>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = br.readLine().toInt()
    arr = Array(100){0L}

    bw.write("${fiboDP(n)}")
    bw.flush()
    bw.close()
}

fun fiboDP(n: Int): Long {
    if (n == 1) return 1
    if (n == 2) return 1
    if (arr[n] != 0L) return arr[n]
    arr[n] = fiboDP(n - 1) + fiboDP(n - 2)
    return arr[n]
}