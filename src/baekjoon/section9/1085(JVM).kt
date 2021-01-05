package practice.baekjoon.section9

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val arr = ArrayList<Int>(4)

    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    val w = st.nextToken().toInt()
    val h = st.nextToken().toInt()

    arr.add(x)
    arr.add(y)
    arr.add(w - x)
    arr.add(h - y)

    bw.write("${arr.min()}")
    bw.flush()
    bw.close()
}
