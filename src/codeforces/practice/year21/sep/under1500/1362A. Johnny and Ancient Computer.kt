package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toLong() }
        val max = maxOf(a, b)
        val min = minOf(a, b)

        if (max % min != 0L) {
            bw.write("-1")
        } else if (max == min) {
            bw.write("0")
        }else {
            var tmp = min
            var cnt = 0
            while (true) {
                if (tmp >= max) break
                tmp *= 8
                cnt++
            }
            when (max / (tmp / 8)) {
                2L, 4L, 8L -> if (max % (tmp / 8) == 0L) bw.write("$cnt") else bw.write("-1")
                else -> bw.write("-1")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}