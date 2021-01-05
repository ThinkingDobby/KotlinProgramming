package codeforces.contests.virtual.div2_688

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        var count = 0

        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val bottomTrains = Array(n) { st2.nextToken().toInt() }

        val st3 = StringTokenizer(br.readLine())
        for (i in 0 until m) {
            val tmp = st3.nextToken().toInt()
            if (tmp in bottomTrains) count++
        }

        bw.write("$count")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}