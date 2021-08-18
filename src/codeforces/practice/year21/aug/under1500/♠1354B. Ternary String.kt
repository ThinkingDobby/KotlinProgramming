package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine().toCharArray()

        var max = Int.MAX_VALUE
        var prev = 0
        var temp = 0

        for (i in 1 until input.size) {
            if (input[temp] != input[i]) {
                if (listOf(input[prev], input[temp], input[i]).sorted() == listOf('1', '2', '3')) {
                    max = minOf(max, i - prev + 1)
                }
                prev = temp
                temp = i
            } else temp = i
        }

        if (max == Int.MAX_VALUE) max = 0
        bw.write("$max")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
