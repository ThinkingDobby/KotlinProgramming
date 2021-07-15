package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    var n = st.nextToken().toInt()

    var aTurn = true
    while (true) {
        if (aTurn) {
            val gcd = gcd(a, n)
            if (n >= gcd) {
                n -= gcd
                aTurn = false
            }
            else break
        } else {
            val gcd = gcd(b, n)
            if (n >= gcd) {
                n -= gcd
                aTurn = true
            }
            else break
        }
    }

    if (aTurn) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}