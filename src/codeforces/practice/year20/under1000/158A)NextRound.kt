package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val t = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val contestants = MutableList(n) { st2.nextToken().toInt() }

    val ans = contestants.count { it >= contestants[t - 1] && it > 0 }

    bw.write("$ans")

    bw.flush()
    bw.close()
}