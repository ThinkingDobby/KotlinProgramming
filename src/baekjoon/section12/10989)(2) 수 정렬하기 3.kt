package baekjoon.section12

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val memo = Array(10001) { 0 }

    repeat(n) {
        val input = br.readLine().toInt()
        memo[input]++
    }

    for (i in 1..10000) {
        if (memo[i] == 0) continue
        repeat(memo[i]) {
            bw.write("$i")
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}

