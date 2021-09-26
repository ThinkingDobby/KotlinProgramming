package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
                .withIndex().partition { it.value % 2 == 0 }

        var i = 0
        var j = 0
        repeat(n - 1) {
            if (i < a.size - 1) {
                bw.write("${a[i++].index + 1} ${a[i++].index + 1}")
                bw.newLine()
            } else {
                bw.write("${b[j++].index + 1} ${b[j++].index + 1}")
                bw.newLine()
            }
        }
    }

    bw.flush()
    bw.close()
}

