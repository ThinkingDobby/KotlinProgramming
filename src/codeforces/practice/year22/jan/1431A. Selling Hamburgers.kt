package codeforces.practice.year22.jan

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toLong() }.sortedDescending()

        var max = -1L
        for (i in input.indices) {
            max = maxOf(max, (i + 1) * input[i])
        }

        bw.write("$max")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
