package codeforces.contests.virtual.div2_edu_112

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toLong()

        if (n <= 6) bw.write("15")
        else bw.write("${(n + 1) / 2 * 5}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}