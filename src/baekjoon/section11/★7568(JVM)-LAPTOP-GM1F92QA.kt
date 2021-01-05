package baekjoon.section11

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val height = Array(n) { 0 }
    val weight = Array(n) { 0 }
    val rank = Array(n) { 1 }

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        height[i] = st.nextToken().toInt()
        weight[i] = st.nextToken().toInt()
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (height[i] < height[j] && weight[i] < weight[j]) rank[i]++
        }
    }

    for (i in 0 until n) bw.write("${rank[i]} ")

    bw.flush()
    bw.close()
}