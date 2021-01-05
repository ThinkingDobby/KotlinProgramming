package practice.baekjoon.section8

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val v = st.nextToken().toInt()

    var tmp = (v - a) / (a - b)
    tmp += if ((v - a) % (a - b) == 0) 1
    else 2

    bw.write("$tmp")
    bw.flush()
    bw.close()
}