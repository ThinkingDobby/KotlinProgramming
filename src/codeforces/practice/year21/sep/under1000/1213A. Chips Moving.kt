package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }
    val oddNum = inputs.count { it % 2 == 1 }
    val evenNum = inputs.count { it % 2 == 0 }
    bw.write("${minOf(oddNum, evenNum)}")

    bw.flush()
    bw.close()
}