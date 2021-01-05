package codeforces.contests.realtime.div2_692

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val s = br.readLine()

        var count = 0
        for (i in s) {
            if (i == ')') count++
            else count = 0
        }

        if (count > s.length / 2) {
            bw.write("Yes")
        } else {
            bw.write("No")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}