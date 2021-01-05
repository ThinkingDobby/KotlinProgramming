package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val inputs = Array(4) { st.nextToken().toInt() }.sorted()
    for (i in 0 until 3) {
        bw.write("${inputs[3] - inputs[i]} ")
    }

    bw.flush()
    bw.close()
}