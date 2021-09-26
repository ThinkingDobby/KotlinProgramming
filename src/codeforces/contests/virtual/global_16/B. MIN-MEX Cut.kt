package codeforces.contests.virtual.global_16

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        var cnt = 0
        if (input[0] == '0') cnt++
        for (i in 1 until input.length) {
            if (input[i - 1] == '1' && input[i] == '0') cnt++
        }

        bw.write("${minOf(cnt, 2)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
