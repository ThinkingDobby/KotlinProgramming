package codeforces.contests.realtime.kotlin_heroes_p9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }
        val tmp = input.indexOfFirst { it != input[0] }
        if (tmp == 1) {
            if (input[0] == input[2]) {
                bw.write("2")
            } else {
                bw.write("1")
            }
        } else {
            bw.write("${tmp + 1}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
