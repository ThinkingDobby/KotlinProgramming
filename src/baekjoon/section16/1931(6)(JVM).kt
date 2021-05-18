package baekjoon.section16
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = mutableListOf<Pair<Int, Int>>()

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        inputs.add(Pair(st.nextToken().toInt(), st.nextToken().toInt()))
    }

    inputs.sortWith(Comparator { a, b ->
        if (a.second == b.second) {
            a.first - b.first
        } else {
            a.second - b.second
        }
    })

    var count = 0
    var end = -1
    for (i in 0 until n) {
        if (inputs[i].first > end) {
            end = inputs[i].second
            count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}