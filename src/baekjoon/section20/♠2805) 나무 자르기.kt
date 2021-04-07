package baekjoon.section20

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toLong()

    val st2 = StringTokenizer(br.readLine())
    val trees = Array(n) { st2.nextToken().toLong() }.sortedArray()

    var start = 0L
    var end = trees[n - 1]

    var tmp = Long.MAX_VALUE
    var ans = 0L

    while (start <= end) {
        val mid = (start + end) / 2
        val sum = calcSum(mid, trees)
        if (sum >= m) {
            if (sum <= tmp) {
                ans = mid
                tmp = sum
            }
            start = mid + 1
        } else {
            end = mid - 1
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}

private fun calcSum(target: Long, arr: Array<Long>): Long {
    var sum = 0L
    for (i in arr) {
        if (i > target) sum += i - target
    }
    return sum
}
