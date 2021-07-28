package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${fac(minOf(a, b))}")

    bw.flush()
    bw.close()
}

private fun fac(a: Int, b: Int = 1): Int {
    return if (a == 1) b else fac(a - 1, a * b)
}