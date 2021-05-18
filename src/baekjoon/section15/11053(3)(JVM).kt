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

    val dp = Array(n + 1) { 0 }     // 부분수열들의 길이 저장
    for (i in 1..n) {
        var max = 0
        for (j in 0 until i) {      // 각 arr[i]값에 대해 0항부터 비교
            if (arr[i] > arr[j]) {  // 거짓인 경우 다음 항 비교
                if (dp[j] > max) max = dp[j]
            }
        }
        dp[i] = max + 1 // 모든 항 비교 후 가장 긴 길이 값에 +1
    }

    bw.write("${dp.max()}")     // 가장 긴 경우 탐색

    bw.flush()
    bw.close()
}