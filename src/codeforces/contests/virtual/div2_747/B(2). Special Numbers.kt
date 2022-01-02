package codeforces.contests.virtual.div2_747

import java.io.*

private const val MOD = 1_000_000_007

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var (n, k) = br.readLine().split(" ").map { it.toInt() }
        var ans = 0L
        var tmp = 1L
        while (k != 0) {
            if (k % 2 == 1) ans += tmp % MOD
            tmp = n * tmp % MOD
            k /= 2
        }

        bw.write("${ans % MOD}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
