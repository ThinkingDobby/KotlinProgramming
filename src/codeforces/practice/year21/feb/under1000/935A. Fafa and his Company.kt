package codeforces.practice.year21.feb.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var count = 0
    for (i in 1 until n) {
        if (n % i == 0) count++
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}