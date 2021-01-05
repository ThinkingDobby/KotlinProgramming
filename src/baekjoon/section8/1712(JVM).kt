package practice.baekjoon.section8

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    var n =0
    n = if (c > b) a / (c - b) + 1
    else -1

    bw.write("$n")
    bw.flush()
    bw.close()
}