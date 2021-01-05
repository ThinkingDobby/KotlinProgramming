package baekjoon.section15
// 틀렸습니다
import java.io.*
import java.util.*

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

    times.sortBy { it.end }
    times.sortBy { it.start }

    var min = times.minBy { it.end }
    var count: Int
    if (min!!.start == min.end) {
        count = 0
    } else {
        count = 1
    }
    for (i in 0 until n) {
        if (times[i].start >= min!!.end) {
            min = times[i]
            count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}