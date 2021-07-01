package codeforces.practice.year21.jun.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val s = br.readLine()

    var lCount = 0
    var rCount = 0
    for (i in s) {
        if (i == 'L') lCount++
        if (i == 'R') rCount++
    }

    bw.write("${lCount + rCount + 1}")

    bw.flush()
    bw.close()
}