package codeforces.contests.virtual.div1p2_733

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (h, w) = br.readLine().split(" ").map { it.toInt() }

        val ans = Array(h){Array(w){0}}
        for (i in 2 until h - 2 step 2) {
            ans[i][0] = 1
            ans[i][w - 1] = 1
        }

        for (i in 0 until w step 2) {
            ans[0][i] = 1
            ans[h - 1][i] = 1
        }

        for (i in 0 until h) {
            for (j in 0 until w) {
                bw.write("${ans[i][j]}")
            }
            bw.newLine()
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

