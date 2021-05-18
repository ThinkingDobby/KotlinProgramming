package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toLong() }.sorted()

    val maxDiff = inputs.last() - inputs.first()
    val firstCount = inputs.lastIndexOf(inputs.first()) + 1L
    val secondCount = n.toLong() - inputs.indexOf(inputs.last())
    val count = if (inputs.last() != inputs.first()) firstCount * secondCount
    else n.toLong() * (n.toLong() - 1) / 2

    bw.write("$maxDiff $count")

    bw.flush()
    bw.close()
}