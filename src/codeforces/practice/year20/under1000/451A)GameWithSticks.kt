package codeforces.practice.year20.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val max = Math.max(n, m)
    val horizontalLines = Array(max) { false }
    val verticalLines = Array(max) { false }

    for (i in 0 until n) {
        horizontalLines[i] = true
    }

    for (i in 0 until m) {
        verticalLines[i] = true
    }

    var count = 0
    for (i in 0 until max) {
        if (horizontalLines[i] && verticalLines[i]) {
            horizontalLines[i] = false
            verticalLines[i] = false
            count++
        }
    }

    if (count % 2 == 0) {
        bw.write("Malvika")
    } else {
        bw.write("Akshat")
    }

    bw.flush()
    bw.close()
}