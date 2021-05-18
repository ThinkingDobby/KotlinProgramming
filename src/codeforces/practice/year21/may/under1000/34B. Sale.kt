package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st2.nextToken().toInt() }.sortedArray()

    var sum = 0
    for (i in 0 until m) {
        if (inputs[i] >= 0) break
        sum += inputs[i]
    }

    bw.write("${-sum}")

    bw.flush()
    bw.close()
}