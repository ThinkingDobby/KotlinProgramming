package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m, x, y) = br.readLine().split(" ").map { it.toInt() }

        var one = 0
        var two = 0
        repeat(n) {
            val line = br.readLine()

            var now = 0
            while (true) {
                if (now >= m) break
                if (line[now] == '.') {
                    one++
                    if (now <= m - 2) {
                        if (line[now + 1] == '.') {
                            two++
                            one++
                            now++
                        }
                    }
                }
                now++
            }
        }

        val ans = minOf(one * x, (one - 2 * two) * x + two * y)
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}