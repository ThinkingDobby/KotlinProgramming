package codeforces.contests.realtime.div2_edu_114

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        for (i in 1..n) {
            bw.write("${"(".repeat(i)}")
            bw.write("${")".repeat(i)}")
            bw.write("${"()".repeat(n - i)}")
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}
