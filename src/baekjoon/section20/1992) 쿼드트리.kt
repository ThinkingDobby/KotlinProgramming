package baekjoon.section20

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = Array(n) {br.readLine()}

    fun func(x: Int, y: Int, range: Int) {
        if (range < 1) return
        var oneColor = true
        val first = inputs[x][y]

        for (i in x until x + range) {
            for (j in y until y + range) {
                if (inputs[i][j] != first) {
                    oneColor = false
                    break
                }
            }
        }

        if (oneColor) {
            if (first == '0') bw.write("0")
            else bw.write("1")
            return
        }
        else {
            bw.write("(")
            func(x, y, range / 2)
            func(x, y + range / 2, range / 2)
            func(x + range / 2, y, range / 2)
            func(x + range / 2, y + range / 2, range / 2)
            bw.write(")")
        }
    }

    func(0, 0, n)

    bw.flush()
    bw.close()
}