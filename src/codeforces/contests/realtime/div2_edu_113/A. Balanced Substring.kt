package codeforces.contests.realtime.div2_edu_113

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()
        var ans = false
        for (i in 0 until n - 1) {
            if (input[i] != input[i + 1]) {
                bw.write("${i + 1} ${i + 2}")
                ans = true
                break
            }
        }

        if (!ans) bw.write("-1 -1")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
