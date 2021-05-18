package baekjoon.section17

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val combination = Array(30) { Array(30) { 0 } }
    combination[1][0] = 1
    combination[1][1] = 1
    for (i in 2 until 30) {
        for (j in 0..i) {
            if (j == 0 || j == i) {
                combination[i][j] = 1
            } else {
                combination[i][j] = combination[i - 1][j - 1] + combination[i - 1][j]
            }
        }
    }

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        bw.write("${combination[m][n]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}