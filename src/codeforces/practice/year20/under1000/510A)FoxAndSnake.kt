package codeforces.practice.year20.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var left = false
    for (i in 1..n) {
        if (i % 2 == 1) {
            for (j in 0 until m) {
                bw.write("#")
            }
        } else if (left) {
            bw.write("#")
            for (j in 1 until m) {
                bw.write(".")
            }
            left = false
        } else {
            for (j in 0 until m - 1) {
                bw.write(".")
            }
            bw.write("#")
            left = true
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}