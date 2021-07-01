package atcoder.practice.abc_b

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val h = st1.nextToken().toInt()
    val w = st1.nextToken().toInt()

    var min = Int.MAX_VALUE
    val grid = Array(h) { IntArray(w) }
    for (i in 0 until h) {
        val st2 = StringTokenizer(br.readLine())
        for (j in 0 until w) {
            grid[i][j] = st2.nextToken().toInt()
            if (grid[i][j] < min) min = grid[i][j]
        }
    }

    var sum = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            sum += grid[i][j] - min
        }
    }

    bw.write("$sum")

    bw.flush()
    bw.close()
}