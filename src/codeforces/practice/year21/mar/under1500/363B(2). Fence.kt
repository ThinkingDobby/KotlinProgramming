package codeforces.practice.year21.mar.under1500

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

    val calc = Array(n - k + 1) { 0 }
    for (i in 0 until k) {
        calc[0] += inputs[i]
    }
    var now = k - 1

    for (i in 1 until n - k + 1) {
        calc[i] = calc[i - 1] - inputs[now - k + 1] + inputs[now + 1]
        now++
    }

    bw.write("${calc.indexOf(calc.min()) + 1}")

    bw.flush()
    bw.close()
}