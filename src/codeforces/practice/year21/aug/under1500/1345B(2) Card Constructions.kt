package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val memo = mutableListOf<Int>()
    var i = 0
    while (true) {
        val temp = 2 * i + 3 * (i * (i - 1) / 2)
        if (temp > 1000000000) break
        memo.add(temp)
        i++
    }

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()

        var now = memo.size - 1
        var cnt = 0
        while (true) {
            if (memo[now] <= n) {
                if (memo[now] == n) {
                    cnt++
                    break
                } else {
                    n -= memo[now]
                    if (n < 0) break
                    cnt++
                }
            } else {
                now--
                if (now == 0) break
            }
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

