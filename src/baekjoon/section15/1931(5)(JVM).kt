package baekjoon.section15
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val timeTable = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        timeTable.add(a to b)
    }

    timeTable.sortWith(Comparator { a, b ->
        if (a.second == b.second) {
            a.first - b.first
        } else {
            a.second - b.second
        }
    })

    var count = 0
    var end = -1
    for (i in 0 until n) {
        if (timeTable[i].first >= end) {
            end = timeTable[i].second
            count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}