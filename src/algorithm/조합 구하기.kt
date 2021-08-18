package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, max) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${comb(a, b, max)}")  // aCb, max: 범위

    bw.flush()
    bw.close()
}

private fun comb(a: Int, b: Int, max: Int): Int {
    val comb = Array(max + 1) { Array(max + 1) { 1 } }
    for (i in 2..max) {
        for (j in 0..i) {
            if (j == 0 || j == i) comb[i][j] = 1
            else comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]
        }
    }

    return comb[a][b]
}