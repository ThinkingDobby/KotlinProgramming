package algorithm

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()

    val ans = gcd(a, b)
    // LCM(최소공배수) = a * b / gcd
    bw.write("$ans")

    bw.flush()
    bw.close()
}

private fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a else gcd(b, a % b)
}