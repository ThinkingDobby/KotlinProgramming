package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val q = br.readLine().toInt()
    repeat(q) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val costs = Array(n) { st.nextToken().toInt() }

        val sum = costs.sum()
        var count = sum / n
        if (sum > count * n) count += 1

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}