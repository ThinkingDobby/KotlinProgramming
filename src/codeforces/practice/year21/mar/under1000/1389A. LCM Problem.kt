package codeforces.practice.year21.mar.under1000

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

        if (x * 2 > y) {
            bw.write("-1 -1")
        } else {
            bw.write("$x ${x * 2}")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}