package practice.baekjoon.section8

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (k in 0 until t) {
        val st = StringTokenizer(br.readLine())
        val h = st.nextToken().toInt()
        val w = st.nextToken().toInt()
        val n = st.nextToken().toInt()

        var cnt = 0
        for (i in 1..w) {
            for (j in 1..h) {
                cnt++
                if (cnt == n) {
                    val tmp = if (i < 10) "0" else ""
                    bw.write(j.toString() + tmp + i.toString() + "\n")
                }
            }
        }
    }

    bw.flush()
    bw.close()
}