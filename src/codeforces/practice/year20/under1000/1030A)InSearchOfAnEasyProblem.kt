package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    if (1 in inputs) {
        bw.write("HARD")
    } else {
        bw.write("EASY")
    }

    bw.flush()
    bw.close()
}