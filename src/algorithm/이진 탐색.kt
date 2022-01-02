package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val ex = arrayOf(1, 1, 1, 2, 2, 2, 3, 3, 3)
    bw.write("binary: ${binarySearch(ex, 2, 0, ex.size - 1)}")
    bw.newLine()
    bw.write("lower: ${lowerBound(ex, 2, 0, ex.size - 1)}")
    bw.newLine()
    bw.write("upper: ${upperBound(ex, 2, 0, ex.size - 1)}")

    bw.flush()
    bw.close()
}

// target 인덱스
private fun binarySearch(arr: Array<Int>, target: Int, _l: Int, _r: Int): Int {
    var l = _l
    var r = _r

    while (l <= r) {
        val mid = (l + r) / 2

        if (arr[mid] < target) l = mid + 1
        else if (arr[mid] > target) r = mid - 1
        else return mid
    }

    return -1
}

// target 이상 최초 값 인덱스
private fun lowerBound(arr: Array<Int>, target: Int, _l: Int, _r: Int): Int {
    var l = _l
    var r = _r

    while (l < r) {
        val mid = (l + r) / 2

        if (arr[mid] < target) l = mid + 1
        else r = mid
    }

    return r
}

// target 초과 최초 값 인덱스
private fun upperBound(arr: Array<Int>, target: Int, _l: Int, _r: Int): Int {
    var l = _l
    var r = _r

    while (l < r) {
        val mid = (l + r) / 2

        if (arr[mid] <= target) l = mid + 1
        else r = mid
    }

    return r
}
