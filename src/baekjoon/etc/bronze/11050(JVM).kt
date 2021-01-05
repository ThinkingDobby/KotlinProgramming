package baekjoon.etc.bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val ans = fac(n) / (fac(k) * fac(n - k))

    bw.write("$ans")

    bw.flush()
    bw.close()
}

fun fac(n: Int, a: Int = 1): Int {
    return if (n == 0) a else fac(n - 1, n * a)
}