package practice.baekjoon.section14

import java.io.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val triangle = Array(n) {
        br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    for (i in n - 2 downTo 0) {
        triangle[i].forEachIndexed { j, num ->
            triangle[i][j] = max(triangle[i + 1][j], triangle[i + 1][j + 1]) + num
        }
    }

    bw.write("${triangle[0][0]}")

    bw.flush()
    bw.close()
}