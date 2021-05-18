package baekjoon.section15
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(n + 1) { 0 }

    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        inputs[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1) { 0 }
    var max = Int.MIN_VALUE
    for (i in 1..n) {
        dp[i] = Math.max(dp[i - 1] + inputs[i], inputs[i])
        if (dp[i] > max) max = dp[i]
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}