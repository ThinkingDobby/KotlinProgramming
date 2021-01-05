package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    var count = 0
    val max = inputs.indexOf(inputs.max())
    val min = inputs.lastIndexOf(inputs.min())

    count = max + n - min - 1
    if (max > min) count--

    bw.write("$count")

    bw.flush()
    bw.close()
}