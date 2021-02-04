package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val costs = Array(4) { st.nextToken().toInt() }

    val input = br.readLine()
    var sum = 0
    for (i in input) {
        sum += costs[i.toInt() - 48 - 1]
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}