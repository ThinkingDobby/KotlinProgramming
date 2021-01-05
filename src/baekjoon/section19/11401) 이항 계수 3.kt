package baekjoon.section19

import java.io.*
import java.util.*

var x = 0L
var y = 0L
var gcd = 0L
var tmp = 0L

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()
    val p = 1_000_000_007L

    val factorial = LongArray(n + 1)
    factorial[0] = 1
    factorial[1] = 1
    for (i in 2..n) {
        factorial[i] = (factorial[i - 1] * i) % p
    }

    val denominator = (factorial[k] * factorial[n - k]) % p

    euclidean(p, denominator)
    var result = ((factorial[n] % p) * (y % p)) % p
    if (result < 0) result += p

    bw.write("$result")

    bw.flush()
    bw.close()
}

fun euclidean(b: Long, p: Long) {
    if (b % p > 0) {
        euclidean(p, b % p)
        tmp = y
        y = x - (b / p) * y
        x = tmp
    } else {
        x = 0
        y = 1
        gcd = p
    }
}