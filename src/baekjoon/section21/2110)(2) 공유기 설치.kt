package baekjoon.section21

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val loc = Array(n) { br.readLine().toInt() }.sortedArray()

    var start = 1
    var end = loc.last() - loc.first()
    var ans = 0

    while (start <= end) {
        val mid = (start + end) / 2
        var count = 1
        var target = loc[0]
        var d: Int
        for (i in 1 until n) {
            d = loc[i] - target
            if (mid <= d) {
                count++
                target = loc[i]
            }
        }

        if (count >= c) {
            ans = mid
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}