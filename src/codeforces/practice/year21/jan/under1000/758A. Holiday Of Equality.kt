package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    val max = inputs.max()!!
    var sum = 0
    for (i in inputs) {
        sum += max - i
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}