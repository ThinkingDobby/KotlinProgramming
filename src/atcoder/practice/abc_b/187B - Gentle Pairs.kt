package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val points = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        points.add(x to y)
    }

    var sum = 0
    for (i in 1 until n) {
        for (j in 0 until i) {
            val tmp = (points[i].second - points[j].second.toDouble()) / (points[i].first - points[j].first)
            if (tmp >= -1 && tmp <= 1) sum++
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}
