package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    var ans = 0

    if (m * a <= b) {
        ans = n * a
    } else {
        if (n % m == 0) {
            ans = b * (n / m)
        } else {
            ans = Math.min(b * (n / m) + a * (n % m), b * (n / m + 1))
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}