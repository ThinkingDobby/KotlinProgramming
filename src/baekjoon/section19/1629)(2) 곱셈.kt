package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    bw.write("${func(a, b, c)}")

    bw.flush()
    bw.close()
}

fun func(a: Int, b: Int, c: Int): Long {
    if (b == 0) return 1L

    val n = func(a, b / 2, c)
    val tmp = n * n % c

    if (b % 2 == 0) {
        return tmp
    } else {
        return a * tmp % c
    }
}