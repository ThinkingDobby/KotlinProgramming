package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()
        val d = st.nextToken().toInt()

        if ((a + b) * n >= c - d && (a - b) * n <= c + d) {
            bw.write("Yes")
        } else {
            bw.write("No")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
