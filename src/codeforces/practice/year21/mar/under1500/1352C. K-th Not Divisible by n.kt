package codeforces.practice.year21.mar.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val st = StringTokenizer(br.readLine())
        var n = st.nextToken().toInt()
        var k = st.nextToken().toInt()

        var start = 1L
        var end = 3000000000L
        var ans = 0L

        while (start <= end) {
            val mid = (start + end) / 2
            val count = mid - mid / n
            if (count >= k) {
                end = mid - 1
                ans = mid
            } else start = mid + 1
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}