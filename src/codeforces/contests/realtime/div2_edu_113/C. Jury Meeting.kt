package codeforces.contests.realtime.div2_edu_113
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val max = 200000
    val mod = 998244353

    val comb = Array(max + 1) { Array(max + 1) { 1 } }
    for (i in 2..max) {
        for (j in 0..i) {
            if (j == 0 || j == i) comb[i][j] = 1
            else comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]
        }
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
        val ans = (inputs.count { it == inputs[0] } * inputs.count { it == inputs[1] } * (comb[n][2] % mod) * (n - 2) * (n - 1)) % mod
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}