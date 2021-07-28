package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val inputs = Array(n) { br.readLine().toCharArray() }

        var count = 0
        for (i in 0 until m - 1) {
            if (inputs[n - 1][i] != 'R') count++
        }
        for (i in 0 until n - 1) {
            if (inputs[i][m - 1] != 'D') count++
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
