package baekjoon.section21
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = ArrayList<Int>()
    inputs.add(0)
    for (i in 0 until n) {
        val temp = st.nextToken().toInt()
        if (temp > inputs.last()) inputs.add(temp)
        else {
            var left = 0
            var right = inputs.size - 1

            while (left < right) {
                val mid = (left + right) / 2
                if (inputs[mid] >= temp) {
                    right = mid // 해당 인덱스를 바꾸는 것(추가x)이므로 mid 를 그대로 저장
                } else {
                    left = mid + 1  // 작을 경우 뒷부분 탐색
                }
            }
            inputs[right] = temp
        }
    }

    bw.write("${inputs.size - 1}")

    /* dp
    val dp = Array(n + 1) { 1 }

    for (i in 1 until n) {
        var max = 0
        for (j in 0 until i) {
            if (inputs[i] > inputs[j]) {
                if (dp[j] > max) max = dp[j]
            }
        }
        dp[i] = max + 1
    }

    bw.write("${dp.max()}")
     */

    bw.flush()
    bw.close()
}