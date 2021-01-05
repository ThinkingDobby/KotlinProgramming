package practice.baekjoon.section3

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())

    repeat(n) {
        val input = st2.nextToken().toInt()
        if (input < x) bw.write("$input ")
    }

    bw.flush()
    bw.close()
}