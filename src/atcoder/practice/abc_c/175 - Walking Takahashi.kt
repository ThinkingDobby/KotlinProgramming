package atcoder.practice.abc_c

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    var x = st.nextToken().toLong()
    val k = st.nextToken().toLong()
    val d = st.nextToken().toLong()

    var ans: Long
    x = Math.abs(x)

    if (x / d <= k) {
        val tmp = k - x / d
        if (tmp % 2 == 0L) {
            ans = x - (x / d) * d
        } else {
            ans = Math.abs(x - (x / d + 1) * d)
        }
    } else {
        ans = x - k * d
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}