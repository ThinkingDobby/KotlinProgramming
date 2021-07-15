package codeforces.contests.virtual.div2_726

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val mountains = Array(n) { st.nextToken().toLong() }.sorted()

        var min = Long.MAX_VALUE
        var minIdx = -1
        for (i in 1 until n) {
            val temp = Math.abs(mountains[i] - mountains[i - 1])
            if (temp < min) {
                min = temp
                minIdx = i
            }
        }

        bw.write("${mountains[minIdx - 1]} ")
        for (i in minIdx + 1 until n) {
            bw.write("${mountains[i]} ")
        }
        for (i in 0 until minIdx - 1) {
            bw.write("${mountains[i]} ")
        }
        bw.write("${mountains[minIdx]} ")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}