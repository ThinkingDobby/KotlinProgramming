package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val first = input.indexOf('R')
        val last = input.lastIndexOf('R')

        if (first == -1) bw.write("${input.length + 1}")
        else {
            var max = Int.MIN_VALUE

            var now = first + 1
            var prev = first
            while (true) {
                if (now > last) break
                if (input[now] == 'R') {
                    max = maxOf(max, now - prev)
                    prev = now
                }
                now++
            }

            val ans = maxOf(first + 1, input.length - last, max)
            bw.write("$ans")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
