package codeforces.contests.realtime.div2_696

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val b = br.readLine()

        val input = mutableListOf<Int>()
        for (i in 0 until n) {
            input.add(b[i].toInt() - 48)
        }

        bw.write("1")
        var prev = input[0] + 1
        for (i in 1 until n) {
            if (input[i] + 1 == prev) {
                prev = input[i]
                bw.write("0")
            }
            else {
                prev = input[i] + 1
                bw.write("1")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}