package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var min = Int.MAX_VALUE
    var sum = 0
    repeat(br.readLine().toInt()) {
        val (a, p) = br.readLine().split(" ").map { it.toInt() }
        min = minOf(min, p)
        sum += a * min
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}
