package codeforces.contests.realtime.div2_edu_101

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st1 = StringTokenizer(br.readLine())
        val rArray = Array(n) { st1.nextToken().toInt() }

        val m = br.readLine().toInt()
        val st2 = StringTokenizer(br.readLine())
        val bArray = Array(m) { st2.nextToken().toInt() }

        var tmp1 = 0
        var max1 = 0
        for (i in 0 until n) {
            tmp1 += rArray[i]
            if (tmp1 > max1) max1 = tmp1
        }

        var tmp2 = 0
        var max2 = 0
        for (i in 0 until m) {
            tmp2 += bArray[i]
            if (tmp2 > max2) max2 = tmp2
        }

        bw.write("${max1 + max2}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}