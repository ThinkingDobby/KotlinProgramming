package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }.sorted()
    var sum = 0
    (0 until n step 2).forEach { sum += inputs[it + 1] - inputs[it] }
    bw.write("$sum")

    bw.flush()
    bw.close()
}