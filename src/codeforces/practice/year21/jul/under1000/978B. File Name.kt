package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()

    var xCount = 0
    var ansCount = 0
    for (i in 0 until n) {
        if (input[i] == 'x') xCount++
        else xCount = 0

        if (xCount >= 3) {
            ansCount++
        }
    }

    bw.write("$ansCount")

    bw.flush()
    bw.close()
}