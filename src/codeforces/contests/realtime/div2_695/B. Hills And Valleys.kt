package codeforces.contests.realtime.div2_695
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        var count = 0
        val inputs = Array(n) { st.nextToken().toInt() }
        val dp = Array(n) {0}

        for (i in 1 until n - 1) {
            if (inputs[i - 1] > inputs[i] && inputs[i] < inputs[i + 1]) {
                count++
                dp[i - 1]++
                dp[i]++
                dp[i + 1]++
            }
            if (inputs[i - 1] < inputs[i] && inputs[i] > inputs[i + 1]) {
                count++
                dp[i - 1]++
                dp[i]++
                dp[i + 1]++
            }
            //3 1 3 5 2
        }

        val ans = count - dp.max()!!

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}