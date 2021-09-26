package codeforces.contests.realtime.div2_edu_114

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, c, m) = br.readLine().split(" ").map { it.toInt() }
        val cnt = a + b + c - 3
        val sorted = listOf(a, b, c).sorted()
        if (sorted[2] - (sorted[0] + sorted[1] + 1) > m) bw.write("NO")
        else {
            if (cnt >= m) bw.write("YES")
            else bw.write("NO")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}