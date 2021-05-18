package baekjoon.section20

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

    var minusOneCount = 0
    var zeroCount = 0
    var oneCount = 0
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
            if (first == -1) minusOneCount++
            else if (first == 0) zeroCount++
            else oneCount++
            return
        }
        else {
            func(x, y, range / 3)
            func(x + range / 3, y, range / 3)
            func(x + range / 3 * 2, y, range / 3)
            func(x, y + range / 3, range / 3)
            func(x, y + range / 3 * 2, range / 3)
            func(x + range / 3, y + range / 3 * 2, range / 3)
            func(x + range / 3 * 2, y + range / 3, range / 3)
            func(x + range / 3, y + range / 3, range / 3)
            func(x + range / 3 * 2, y + range / 3 * 2, range / 3)
        }
    }

    func(1, 1, n)

    bw.write("$minusOneCount\n$zeroCount\n$oneCount")

    bw.flush()
    bw.close()
}