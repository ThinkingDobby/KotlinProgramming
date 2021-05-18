package baekjoon.section21
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st1.nextToken().toInt() }.sortedArray()

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    repeat(m) {
        val target = st2.nextToken().toInt()
        var upper = upperBinary(inputs, target, n)
        val lower = lowerBinary(inputs, target, n)
        if (upper == n - 1 && inputs[n - 1] == target) upper++
        bw.write("${upper - lower} ")
    }

    bw.flush()
    bw.close()
}

private fun upperBinary(array: Array<Int>, target: Int, size: Int): Int {
    var start = 0
    var end = size - 1

    while (start < end) {
        val mid = (start + end) / 2
        if (target < array[mid]) end = mid
        else start = mid + 1
    }
    return end
}

private fun lowerBinary(array: Array<Int>, target: Int, size: Int): Int {
    var start = 0
    var end = size - 1

    while (start < end) {
        val mid = (start + end) / 2
        if (target <= array[mid]) end = mid
        else start = mid + 1
    }
    return end
}
