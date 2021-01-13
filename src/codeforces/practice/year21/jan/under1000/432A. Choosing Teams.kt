package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val k = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st2.nextToken().toInt() }

    bw.write("${inputs.count { it <= 5 - k } / 3}")

    bw.flush()
    bw.close()
}