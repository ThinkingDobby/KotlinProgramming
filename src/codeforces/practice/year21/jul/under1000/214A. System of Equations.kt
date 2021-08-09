package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    var count = 0
    for (i in 0..n) {
        val temp = n - i
        val sqrt = Math.sqrt(temp.toDouble()).toInt()
        if (sqrt * sqrt == temp) {
            if (sqrt + i * i == m) count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}