package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = Array(n) { br.readLine() }

        val points = mutableListOf<Pair<Int, Int>>()
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (inputs[i][j] == '*') points.add(i to j)
            }
        }

        if (points[0].first == points[1].first) {
            if (points[0].first == 0) {
                points.add(1 to points[0].second)
                points.add(1 to points[1].second)
            } else {
                points.add(0 to points[0].second)
                points.add(0 to points[1].second)
            }
        } else if (points[0].second == points[1].second) {
            if (points[0].second == 0) {
                points.add(points[0].first to 1)
                points.add(points[1].first to 1)
            } else {
                points.add(points[0].first to 0)
                points.add(points[1].first to 0)
            }
        } else {
            points.add(points[1].first to points[0].second)
            points.add(points[0].first to points[1].second)
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                var point = false
                for (k in 0 until 4) {
                    if (i to j == points[k]) {
                        bw.write("*")
                        point = true
                    }
                }
                if (!point) bw.write(".")
            }
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}
