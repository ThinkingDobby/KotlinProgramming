package codeforces.practice.year21.mar.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val x = st.nextToken().toInt()

        val ans = if (n <= 2) 1 else (n + x - 3) / x + 1

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
