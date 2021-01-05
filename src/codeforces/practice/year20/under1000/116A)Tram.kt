package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val a = Array(n + 1) { 0 }
    val b = Array(n + 1) { 0 }

    for (i in 1..n) {
        val st = StringTokenizer(br.readLine())
        a[i] = st.nextToken().toInt()
        b[i] = st.nextToken().toInt()
    }

    var max = 0
    var before = 0
    for (i in 1..n) {
        val now = before - a[i] + b[i]
        before = now
        if (now > max) max = now
    }

    bw.write("$max")

    bw.flush()
    bw.close()
}