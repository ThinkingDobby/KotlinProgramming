package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        var ans = 0

        val min = Math.min(a, b)
        val max = Math.max(a, b)

        if (min * 2 < max) ans = max * max
        else ans = (min * 2) * (min * 2)

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}