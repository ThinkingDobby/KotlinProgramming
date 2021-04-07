package codeforces.practice.year21.feb.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val input = Array(2) { st1.nextToken().toLong() }.sortedArray()

        val st2 = StringTokenizer(br.readLine())
        val a = st2.nextToken().toLong()
        val b = st2.nextToken().toLong()

        var aCount = input[1] - input[0]
        var bCount = 0L

        if (a * 2 < b) {
            aCount += input[0] * 2
        } else {
            bCount += input[0]
        }

        val ans = a * aCount + b * bCount

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}