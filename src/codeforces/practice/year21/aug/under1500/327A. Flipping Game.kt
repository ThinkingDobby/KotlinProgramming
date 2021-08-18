package codeforces.practice.year21.aug.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    var max = 0
    var start = 0
    var end = 0
    var cnt = 0

    for (i in 0 until n) {
        for (j in i until n) {
            var cnt0 = 0
            var cnt1 = 0
            for (k in i..j) {
                if (inputs[k] == 0) cnt0++
                else cnt1++
            }
            val tmp = cnt0 - cnt1
            if (tmp > max) {
                max = tmp
                cnt = cnt0
                start = i
                end = j
            }
        }
    }

    val ans = (0 until start).count{inputs[it] == 1} + cnt + (end + 1 until n).count{inputs[it] == 1}

    bw.write("$ans")

    bw.flush()
    bw.close()
}
