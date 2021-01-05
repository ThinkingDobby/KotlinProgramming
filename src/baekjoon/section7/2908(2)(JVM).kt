package practice.baekjoon.section7

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().reversed().toInt()
    val b = st.nextToken().reversed().toInt()

    if (a > b) bw.write("$a")
    else bw.write("$b")

    bw.flush()
    bw.close()
}