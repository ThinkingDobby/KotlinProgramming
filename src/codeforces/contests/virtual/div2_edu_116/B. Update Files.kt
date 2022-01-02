package codeforces.contests.virtual.div2_edu_116

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var (n, k) = br.readLine().split(" ").map { it.toLong() }

        n--
        var cnt = 0L
        var a = 0L
        var b = 1L
        while (true) {
            if (n <= 0) break
            val tmp = b
            b += a
            a += tmp
            if (b >= k) break

            n -= b
            cnt++
        }

        cnt += (n + k - 1) / k
        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}