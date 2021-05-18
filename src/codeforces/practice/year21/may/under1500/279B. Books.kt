package codeforces.practice.year21.may.under1500
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val t = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val times = Array(n) { st2.nextToken().toInt() }.sortedArray()

    var start = 0
    var end = n - 1
    var ans = 0

    while (start <= end) {
        val mid = (start + end) / 2
        val timeSum = timeCheck(mid, times)
        if (timeSum > t) {
            end = mid - 1
            ans = mid - 1
        } else if (timeSum < t) {
            start = mid + 1
            ans = mid
        } else {
            ans = mid
            break
        }
    }

    bw.write("${ans + 1}")

    bw.flush()
    bw.close()
}

private fun timeCheck(target: Int, arr: Array<Int>): Long {
    var sum = 0L
    for (i in 0..target) {
        sum += arr[i]
    }
    return sum
}