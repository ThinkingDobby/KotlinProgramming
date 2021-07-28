package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine()

        var fc = 0
        var sc = 0

        var ft = false
        var st = false

        for (i in input) {
            if (y > 0) {
                if (i == 'U') fc++
                if (fc >= y) ft = true
            } else {
                if (i == 'D') fc--
                if (fc <= y) ft = true
            }

            if (x > 0) {
                if (i == 'R') sc++
                if (sc >= x) st = true
            } else {
                if (i == 'L') sc--
                if (sc <= x) st = true
            }
        }

        if (ft && st) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}