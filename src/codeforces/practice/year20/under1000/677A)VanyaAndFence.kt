package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val h = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val heights = Array(n) { st2.nextToken().toInt() }

    val ans = heights.count { it > h } * 2 + heights.count { it <= h }

    bw.write("$ans")

    bw.flush()
    bw.close()
}