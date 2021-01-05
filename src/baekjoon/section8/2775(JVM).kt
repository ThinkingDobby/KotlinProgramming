package practice.baekjoon.section8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 0 until t) {
        val arr = Array(15) { IntArray(15) }
        val k = br.readLine().toInt()
        val n = br.readLine().toInt()

        for (j in 0..k) arr[j][1] = 1
        for (j in 0..n) arr[0][j] = j

        for (l in 1..k) {
            for (m in 2..n) {
                arr[l][m] = arr[l][m - 1] + arr[l - 1][m]
            }
        }

        bw.write("${arr[k][n]}\n")
    }

    bw.flush()
    bw.close()
}