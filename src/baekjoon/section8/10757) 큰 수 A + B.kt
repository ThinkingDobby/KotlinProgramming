package baekjoon.section8

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toBigInteger()
    val b = st.nextToken().toBigInteger()

    bw.write("${a + b}")

    bw.flush()
    bw.close()
}