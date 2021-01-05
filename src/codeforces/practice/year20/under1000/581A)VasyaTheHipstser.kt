package codeforces.practice.year20.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    bw.write("${Math.min(a, b)} ")
    bw.write("${(Math.max(a, b) - Math.min(a, b)) / 2}")

    bw.flush()
    bw.close()
}