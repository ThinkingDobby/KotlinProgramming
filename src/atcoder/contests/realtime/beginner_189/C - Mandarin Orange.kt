package atcoder.contests.realtime.beginner_189
// 미완성
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }
    val dp = Array(n) { 1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (inputs[i] >= inputs[j]) dp[j]++
        }
    }
}