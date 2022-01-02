package codeforces.contests.virtual.div3_753

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val memo = br.readLine()
        val input = br.readLine()
        var sum = 0
        for (i in 1 until input.length) {
            sum += Math.abs(memo.indexOf(input[i]) - memo.indexOf(input[i - 1]))
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
