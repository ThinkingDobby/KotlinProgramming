package practice

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}


//upper 바운드 계산
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

//lower 바운드 계산
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
