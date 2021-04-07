package codeforces.practice.year21.feb.under1500
// DP 또는 이분탐색을 이용해 풀이 가능
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var prev = 0
    val dp = Array(10100000) { 0 }

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    for (i in 1..n) {
        val tmp = st1.nextToken().toInt()
        for (j in prev + 1..prev + tmp) dp[j] = i
        prev += tmp
    }

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    for (i in m downTo 1) {
        val tmp = st2.nextToken().toInt()
        bw.write("${dp[tmp]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}