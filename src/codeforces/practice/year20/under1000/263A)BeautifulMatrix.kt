package codeforces.practice.under1000

import java.io.*
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val matrix = Array(5) { IntArray(5) }
    var x = 0
    var y = 0

    for (i in 0 until 5) {
        val st = StringTokenizer(br.readLine())
        for (j in 0 until 5) {
            matrix[i][j] = st.nextToken().toInt()
            if (matrix[i][j] == 1) {
                x = i
                y = j
            }
        }
    }

    bw.write("${abs(2 - x) + abs(2 - y)}")

    bw.flush()
    bw.close()
}