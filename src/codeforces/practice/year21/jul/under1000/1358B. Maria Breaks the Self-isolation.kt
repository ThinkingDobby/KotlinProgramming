package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()

        var count = 0
        var now = 1
        var sum = 1
        for (i in 0 until n) {
            count++
            if (now >= input[i]) {
                sum += count
                count = 0
            }
            now++
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
