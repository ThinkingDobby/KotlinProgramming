package baekjoon.section21
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val locations = Array(n) { br.readLine().toLong() }.sortedArray()

    var start = 1L
    var end = locations.last() - locations[0]
    var d: Long
    var ans = 0L

    while (start <= end) {
        val mid = (start + end) / 2
        var target = locations[0]
        var count = 1

        for (i in 1 until n) {
            d = locations[i] - target
            if (mid <= d) {
                count++
                target = locations[i]
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