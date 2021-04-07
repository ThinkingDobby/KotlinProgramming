package atcoder.practice.abc_c

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val heights = Array(n) { st.nextToken().toLong() }

    var count = 0L
    for (i in 1 until n) {
        if (heights[i - 1] > heights[i]) {
            count += heights[i - 1] - heights[i]
            heights[i] = heights[i - 1]
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}