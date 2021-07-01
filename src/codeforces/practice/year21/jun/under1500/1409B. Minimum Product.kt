package codeforces.practice.year21.jun.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toLong()
        val b = st.nextToken().toLong()
        val x = st.nextToken().toLong()
        val y = st.nextToken().toLong()
        val n = st.nextToken().toLong()

        var ans = Long.MAX_VALUE

        if (a - n >= x) {
            ans = Math.min(ans, (a - n) * b)
        } else {
            var temp = b - (n - (a - x))
            if (temp < y) temp = y
            ans = Math.min(ans, x * temp)
        }

        if (b - n >= y) {
            ans = Math.min(ans, (b - n) * a)
        } else {
            var temp = a - (n - (b - y))
            if (temp < x) temp = x
            ans = Math.min(ans, y * temp)
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}