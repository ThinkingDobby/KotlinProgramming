package baekjoon.section16

import java.io.*
import java.util.*

data class Time(val start: Int, val end: Int)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val times = mutableListOf<Time>()

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()
        times.add(i, Time(start, end))
    }

    times.sortBy { it.start }
    times.sortBy { it.end }

    var count = 0
    var end = -1
    for (i in 0 until n) {
        if (times[i].start >= end) {
            end = times[i].end
            count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}