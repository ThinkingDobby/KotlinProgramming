package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val paper = Array(n + 1) { IntArray(n + 1) }

    for (i in 1..n) {
        val st = StringTokenizer(br.readLine())
        for (j in 1..n) {
            paper[i][j] = st.nextToken().toInt()
        }
    }


    var whiteCount = 0
    var blueCount = 0
    fun func(x: Int, y: Int, range: Int) {
        if (range < 1) return
        var oneColor = true
        val first = paper[x][y]

        for (i in x until x + range) {
            for (j in y until y + range) {
                if (paper[i][j] != first) {
                    oneColor = false
                    break
                }
            }
        }

        if (oneColor) {
            if (first == 0) whiteCount++
            else blueCount++
            return
        }
        else {
            func(x, y, range / 2)
            func(x + range / 2, y, range / 2)
            func(x, y + range / 2, range / 2)
            func(x + range / 2, y + range / 2, range / 2)
        }
    }

    func(1, 1, n)

    bw.write("$whiteCount\n$blueCount")

    bw.flush()
    bw.close()
}