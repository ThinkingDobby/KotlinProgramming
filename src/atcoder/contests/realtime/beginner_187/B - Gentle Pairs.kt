package atcoder.contests.realtime.beginner_187

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pairs = mutableListOf<Pair<Int, Int>>()

    val n = br.readLine().toInt()
    var count = 0
    repeat(n) {
        val st = StringTokenizer(br.readLine())

        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        pairs.add(x to y)
    }

    var ans = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if (Math.abs(pairs[i].second - pairs[j].second) <= Math.abs(pairs[i].first - pairs[j].first)) {
                count++
            }
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}