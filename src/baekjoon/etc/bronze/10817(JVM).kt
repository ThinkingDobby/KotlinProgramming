package practice.baekjoon.etc.bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    val arr = arrayOf(a, b, c)
    arr.sort()
    bw.write("${arr[1]}")

    bw.flush()
    bw.close()
}