package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, a, b) = br.readLine().split(" ").map { it.toInt() }
    var now = -1
    for (i in a..n) {
        if (n - 1 - i <= b) {
            now = i
            break
        }
    }

    bw.write("${n - now}")

    bw.flush()
    bw.close()
}