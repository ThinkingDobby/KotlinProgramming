package codeforces.practice.year21.mar.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toLong() }

        var prev = inputs[0]
        var sum = 0L
        var max = inputs[0]

        for (i in 1 until n) {
            if (prev < 0) {
                if (inputs[i] > 0) {
                    sum += max
                    prev = inputs[i]
                }
                if (inputs[i] > max) max = inputs[i]
            } else {
                if (inputs[i] > 0) {
                    if (inputs[i] > max) max = inputs[i]
                } else {
                    sum += max
                    max = inputs[i]
                    prev = inputs[i]
                }
            }
        }

        sum += max
        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}