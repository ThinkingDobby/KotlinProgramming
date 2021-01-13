package codeforces.contests.realtime.div2_694

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val x = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val inputs = Array(n) { st2.nextToken().toInt() }

        var minSum = 0L
        var maxSum = 0L

        for (i in 0 until n) {
            maxSum += (inputs[i] + x - 1) / x
            minSum += inputs[i]
        }

        minSum = (minSum + x - 1) / x

        bw.write("$minSum $maxSum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}