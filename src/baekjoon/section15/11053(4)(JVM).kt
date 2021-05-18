package baekjoon.section15
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = Array(n + 1) { 0 }
    val st = StringTokenizer(br.readLine())

    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1) { 0 }

    for (i in 1..n) {
        var max = 0
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                if (dp[j] > max) max = dp[j]
            }
        }
        dp[i] = max + 1
    }

    bw.write("${dp.max()}")

    bw.flush()
    bw.close()
}