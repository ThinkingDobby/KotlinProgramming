package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toLong() }.sorted()
    val check = (2 until n).any { inputs[it - 2] + inputs[it - 1] > inputs[it] }

    if (check) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}