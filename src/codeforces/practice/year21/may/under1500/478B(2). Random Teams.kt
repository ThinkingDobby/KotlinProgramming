package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toLong()
    val m = st.nextToken().toLong()

    val min = res(n / m + 1) * (n % m) + res(n / m) * (m - n % m)
    val max = res(n - (m - 1))

    bw.write("$min $max")

    bw.flush()
    bw.close()
}

private fun res(n: Long): Long {
    return n * (n - 1) / 2
}