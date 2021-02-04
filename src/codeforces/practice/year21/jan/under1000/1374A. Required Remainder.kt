package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()
        val n = st.nextToken().toInt()

        var tmp = n / x
        var ans = tmp * x + y
        while (true) {
            if (ans <= n) break
            tmp--
            ans = tmp * x + y
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}