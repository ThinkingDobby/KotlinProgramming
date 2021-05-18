package baekjoon.section21

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = List(n){st.nextToken().toInt()}.sorted()

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    repeat(m) {
        val target = st2.nextToken().toInt()
        val lower = lowerBinary(inputs, target, n)
        var upper = upperBinary(inputs, target, n)
        if (upper == n - 1 && inputs[n - 1] == target) upper++
        bw.write("${upper - lower} ")
    }

    bw.flush()
    bw.close()
}

private fun lowerBinary(arr: List<Int>, target: Int, size: Int): Int {
    var start = 0
    var end = size - 1
    while (end > start) {
        val mid = (start + end) / 2
        if (target <= arr[mid]) end = mid
        else start = mid + 1
    }
    return end
}

private fun upperBinary(arr: List<Int>, target: Int, size: Int): Int {
    var start = 0
    var end = size - 1
    while (end > start) {
        val mid = (start + end) / 2
        if (target < arr[mid]) end = mid
        else start = mid + 1
    }
    return end
}