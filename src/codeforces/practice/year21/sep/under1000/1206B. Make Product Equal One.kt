package codeforces.practice.year21.sep.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var sum = 0L
    val st = StringTokenizer(br.readLine())
    var cnt = 0
    var zCnt = 0
    for (i in 0 until n) {
        val input = st.nextToken().toLong()
        if (input < 0) {
            sum += -1 - input
            cnt++
        } else if (input > 0) sum += input - 1
        else {
            sum++
            zCnt++
        }
    }

    if (zCnt < 1) {
        if (cnt % 2 == 1) sum += 2
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}