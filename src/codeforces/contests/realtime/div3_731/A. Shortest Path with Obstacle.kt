package codeforces.contests.realtime.div3_731

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine()
        val a = br.readLine().split(" ")
        val b = br.readLine().split(" ")
        val f = br.readLine().split(" ")

        var count = 0
        if (((a[0] == b[0] && b[0] == f[0]) && ((a[1].toInt() < f[1].toInt() && f[1].toInt() < b[1].toInt()) || (a[1].toInt() > f[1].toInt() && f[1].toInt() > b[1].toInt())))
                || ((a[1] == b[1] && b[1] == f[1]) && ((a[0].toInt() < f[0].toInt() && f[0].toInt() < b[0].toInt()) || (a[0].toInt() > f[0].toInt() && f[0].toInt() > b[0].toInt())))) {

            count = Math.abs(a[0].toInt() - b[0].toInt()) + Math.abs(a[1].toInt() - b[1].toInt()) + 2
        } else {
            count = Math.abs(a[0].toInt() - b[0].toInt()) + Math.abs(a[1].toInt() - b[1].toInt())
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}