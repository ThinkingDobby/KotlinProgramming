package codeforces.practice.year21.aug.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        val rows = Array(n) { 0 }
        val cols = Array(m) { 0 }

        for (i in 0 until n) {
            val st = StringTokenizer(br.readLine())
            for (j in 0 until m) {
                if (st.nextToken().toInt() == 1) {
                    rows[i] = 1
                    cols[j] = 1
                }
            }
        }

        val temp = minOf(n - rows.sum(), m - cols.sum())
        if (temp % 2 == 1) bw.write("Ashish")
        else bw.write("Vivek")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
