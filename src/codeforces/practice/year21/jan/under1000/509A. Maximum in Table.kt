package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val table = Array(n + 1) { Array(n + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 && j == 1) table[i][j] = 1
            else table[i][j] = table[i][j - 1] + table[i - 1][j]
        }
    }

    bw.write("${table[n][n]}")

    bw.flush()
    bw.close()
}