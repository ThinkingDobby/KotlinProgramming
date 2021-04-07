package baekjoon.section20

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val houses = Array(n) { br.readLine().toInt() }.sortedArray()

    var start = 1
    var end = houses.last() - houses.first()
    var ans = 0

    while (start <= end) {
        val mid = (start + end) / 2
        var prev = houses[0]
        var count = 1
        for (i in 1 until n) {
            if (houses[i] - prev >= mid) {
                count++
                prev = houses[i]
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
