package codeforces.contests.realtime.goodbye2020

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().toMutableList()

        var count = 0
        for (i in 1 until input.size) {
            if (input[i] == input[i - 1]) {
                input[i] = '@'
                count++
            } else if (i != 1 && input[i] == input[i - 2]) {
                input[i] = '@'
                count++
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}