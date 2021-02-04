package codeforces.practice.year21.feb.under1500

import java.io.*
import java.math.BigInteger
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val t = st.nextToken().toBigInteger()

    var tmp = BigInteger.ONE
    repeat(n - 1) {
        tmp *= BigInteger("10")
    }
    val limit = tmp * BigInteger("10")

    if (tmp % t == BigInteger.ZERO) {
        bw.write("$tmp")
    } else {
        val tmp2 = tmp / t + BigInteger.ONE
        if (tmp2 * t >= limit) {
            bw.write("-1")
        } else {
            bw.write("${tmp2 * t}")
        }
    }

    bw.flush()
    bw.close()
}