package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val inputs = Array(n) { br.readLine() }

    var count = 1
    var tmp = inputs[0]
    for (i in 1 until n) {
        if (inputs[i] != tmp) {
            tmp = inputs[i]
            count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}