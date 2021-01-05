package practice.baekjoon.section5

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        var cnt = 0
        var score = 0
        val case = br.readLine()
        for (i in case) {
            if (i == 'O') {
                cnt++
                score += cnt
            } else cnt = 0
        }
        bw.write("$score\n")
    }
    bw.flush()
    bw.close()
}