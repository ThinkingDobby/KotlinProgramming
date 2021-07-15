package codeforces.contests.virtual.div2_edu_107

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
        val c = st.nextToken().toInt()

        bw.write("1")
        for (i in 0 until a - 1) {
            bw.write("0")
        }

        bw.write(" 1")
        for (i in 0 until b - c) {
            bw.write("1")
        }
        for (i in 0 until c - 1) {
            bw.write("0")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}