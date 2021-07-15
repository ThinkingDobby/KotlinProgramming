package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }.sorted()

        val min = inputs.min()!!
        val minIdx = inputs.lastIndexOf(min)

        val ans = n - (minIdx + 1)

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
