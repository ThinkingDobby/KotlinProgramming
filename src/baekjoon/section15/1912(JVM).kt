package baekjoon.section15
// 메모리 초과
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val arr = Array(n + 1) { 0 }
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    val dp = Array(n + 1) { 0 }

    var max = Int.MIN_VALUE
    for (i in 1..n) {
        for (j in 0 until i) {  // 굳이 일일이 계산할 필요 없음
            dp[j] += arr[i]
            if (dp[j] > max) max = dp[j]
        }
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}