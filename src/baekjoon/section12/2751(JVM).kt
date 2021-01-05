package practice.baekjoon.section12

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { 0 }

    repeat(n) {
        arr[it] = br.readLine().toInt()
    }

    Arrays.parallelSort(arr)

    repeat(n) {
        bw.write("${arr[it]}\n")
    }

    bw.flush()
    bw.close()
}