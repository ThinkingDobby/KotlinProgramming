package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()

        var ans = 1
        for (i in 0 until n) {
            if (i + 1 >= input[i]) ans = i + 2
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
