package baekjoon.section20

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val k = st.nextToken().toInt()
    val n = st.nextToken().toInt()

    val inputs = Array(k) { br.readLine().toLong() }.sortedArray()
    var start = 1L
    var end = inputs[k - 1]

    var ans = 0L
    while (start <= end) {
        val mid = (start + end) / 2
        val count = calcCount(mid, inputs)
        if (count >= n) {
            ans = Math.max(ans, mid)
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}

private fun calcCount(num: Long, arr: Array<Long>): Long {
    var sum = 0L
    for (element in arr) {
        sum += element / num
    }
    return sum
}
