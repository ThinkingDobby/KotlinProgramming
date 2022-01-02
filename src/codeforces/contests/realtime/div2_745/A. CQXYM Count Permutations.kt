package codeforces.contests.realtime.div2_745

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val mod = 1000000007

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toLong()
        var ans = 1L
        for (i in 2..2 * n) {
            ans %= mod  // 각 순간의 값이 mod 를 넘지 않도록 유지
            ans *= i
        }
        bw.write("${(ans / 2) % mod}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
