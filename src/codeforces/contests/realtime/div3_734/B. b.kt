package codeforces.contests.realtime.div3_734

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val memo = Array(26) { 0 }

        for (i in input.indices) {
            memo[input[i] - 'a']++
        }

        val cnt1 = memo.count { it == 1 }
        val cnt2 = memo.count { it >= 2 }

        bw.write("${cnt1 / 2 + cnt2}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
