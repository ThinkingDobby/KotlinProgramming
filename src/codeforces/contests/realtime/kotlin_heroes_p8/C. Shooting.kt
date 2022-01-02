package codeforces.contests.realtime.kotlin_heroes_p8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toInt() }
            .withIndex().sortedByDescending { it.value }
    var sum = 0
    (0 until n).forEach { sum += it * inputs[it].value + 1 }

    bw.write("$sum")
    bw.newLine()
    (0 until n).forEach { bw.write("${inputs[it].index + 1} ") }

    bw.flush()
    bw.close()
}