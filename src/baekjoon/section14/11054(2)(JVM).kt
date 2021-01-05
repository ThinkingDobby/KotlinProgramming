package baekjoon.section14
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n + 2) { 0 }

    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        arr[i] = st.nextToken().toInt()
    }

    val dp1 = Array(n + 2) { 0 }
    val dp2 = Array(n + 2) { 0 }

    for (i in 1..n) {
        var max1 = 0
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                if (dp1[j] > max1) max1 = dp1[j]
            }
        }
        dp1[i] = max1 + 1
    }

    for (i in n downTo 1) {
        var max2 = 0
        for (j in n + 1 downTo i + 1) {
            if (arr[i] > arr[j]) {
                if (dp2[j] > max2) max2 = dp2[j]
            }
        }
        dp2[i] = max2 + 1
    }

    val ans = dp1.zip(dp2).map { it.first + it.second - 1 }.max()

    bw.write("$ans")

    bw.flush()
    bw.close()
}