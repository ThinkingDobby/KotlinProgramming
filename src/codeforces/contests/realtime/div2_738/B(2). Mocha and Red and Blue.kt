package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().toCharArray()

        val first = input.indexOfFirst { it != '?' }
        if (first == -1) input[0] = 'R'
        for (i in first - 1 downTo 0) {
            input[i] = if (input[i + 1] == 'R') 'B' else 'R'
        }
        for (i in first + 1 until n) {
            if (i == 0) continue
            if (input[i] == '?') input[i] = if (input[i - 1] == 'R') 'B' else 'R'
        }

        input.forEach { bw.write("$it") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}