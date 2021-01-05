package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val inputs = Array(n + 1) {0}
    val st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        inputs[i] = st.nextToken().toInt()
    }

    val ans = Array(n + 1) {0}
    for (i in 1..n) {
        ans[inputs[i]] = i
    }

    for (i in 1..n) {
        bw.write("${ans[i]} ")
    }

    bw.flush()
    bw.close()
}