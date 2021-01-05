package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val inputs = Array(4) { st.nextToken().toInt() }.toSet()

    bw.write("${4 - inputs.size}")

    bw.flush()
    bw.close()
}