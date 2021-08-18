package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().toCharArray()

        val firstB = input.indexOf('B')
        val firstR = input.indexOf('R')

        var start = ""
        var target = 0
        if (firstB != -1 && (firstB < firstR || firstR == -1)) {
            if (firstB % 2 == 0) start = "B"
            else start = "R"
            target = firstB

        }
        if (firstR != -1 && (firstR < firstB || firstB == -1)) {
            if (firstR % 2 == 0) start = "R"
            else start = "B"
            target = firstR
        }
        if (firstB == -1 && firstR == -1) input[0] = 'B'

        for (i in 0 until target) {
            if (start == "R") {
                bw.write("R")
                start = "B"
            } else {
                bw.write("B")
                start = "R"
            }
        }

        for (j in target until n - 1) {
            if (input[j] == 'R') {
                bw.write("R")
                if (input[j + 1] == '?') input[j + 1] = 'B'
            }
            if (input[j] == 'B') {
                bw.write("B")
                if (input[j + 1] == '?') input[j + 1] = 'R'
            }
        }

        bw.write("${input.last()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}