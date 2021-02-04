package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val arr = Array(30){Math.pow(2.0, (it + 1).toDouble()).toInt()}
    repeat(t) {
        val n = br.readLine().toInt()

        var sum = 0
        for (i in 0 until n / 2) {
            sum += arr[i + 1] - arr[i]
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}