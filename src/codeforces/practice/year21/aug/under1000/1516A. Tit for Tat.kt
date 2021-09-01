package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine().split(" ").map { it.toInt() }.toIntArray()

        var cnt = k
        a@ for (i in 0 until n) {
            while (input[i] != 0) {
                input[i]--
                input[n - 1]++
                cnt--
                if (cnt == 0) break@a
            }
        }

        input.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}