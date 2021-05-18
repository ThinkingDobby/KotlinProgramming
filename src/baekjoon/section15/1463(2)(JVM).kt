package baekjoon.section15

import java.io.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = Array(1000001) { 0 }

    for (i in 2..n) {
        arr[i] = arr[i - 1] + 1
        if (i % 2 == 0) {
            arr[i] = min(arr[i], arr[i / 2] + 1)
        }
        if (i % 3 == 0) {
            arr[i] = min(arr[i], arr[i / 3] + 1)
        }
    }

    bw.write("${arr[n]}")

    bw.flush()
    bw.close()
}