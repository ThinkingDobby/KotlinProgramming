package codeforces.contests.virtual.div2_747
// TLE
import java.io.*

private const val MOD = 1_000_000_007

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }
        val memo = Array(k + 1) { 0L }
        memo[0] = 1

        var tmp = 1.0

        a@while (true) {
            var now = Math.pow(2.0, tmp).toInt() - 1
            var j = now

            var sum = 1L
            for (t in 1..tmp.toInt()) {
                sum = sum * n % MOD
            }

            memo[now] = sum

            for (i in 0..now) {
                j++
                if (j >= k) break@a
                if (i == now - 1) memo[j] = (memo[j - 1] + 1) % MOD
                else memo[j] = (memo[i] + memo[now]) % MOD
            }
            tmp += 1
        }

        bw.write("${memo[k - 1]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
