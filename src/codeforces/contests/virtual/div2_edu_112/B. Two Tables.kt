package codeforces.contests.virtual.div2_edu_112

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (W, H) = br.readLine().split(" ").map { it.toLong() }
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toLong() }
        val (w, h) = br.readLine().split(" ").map { it.toLong() }

        val first = W - (x2 - x1) >= w
        val second = H - (y2 - y1) >= h

        if (!first && !second) bw.write("-1")
        else {
            if (x1 > w || W - x2 > w || y1 > h || H - y2 > h) bw.write("0")
            else {
                var ans = Long.MAX_VALUE
                if (first) ans = minOf(ans, w - maxOf(x1, W - x2))
                if (second) ans = minOf(ans, h - maxOf(y1, H - y2))

                bw.write("$ans")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}