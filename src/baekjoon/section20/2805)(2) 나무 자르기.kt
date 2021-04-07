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

    var satisfiedMin = Int.MAX_VALUE.toLong()
    var ans = 0L

    while (start <= end) {
        val mid = (start + end) / 2
        val tmp = calcSum(mid, trees)
        if (tmp >= m) {
            if (satisfiedMin > tmp) {
                satisfiedMin = tmp
                ans = mid
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
    for (element in arr) {
        if (element > target) sum += element - target
    }
    return sum
}

