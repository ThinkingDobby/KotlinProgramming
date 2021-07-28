package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val memo = mutableListOf<Int>()

        var now = 0
        var cnt = 0
        while (true) {
            if (now == input.length) break
            if (input[now] == '1') cnt++
            else {
                if (cnt != 0) {
                    memo.add(cnt)
                }
                cnt = 0
            }
            now++
        }

        if (input.last() == '1') memo.add(cnt)

        memo.sortDescending()

        var sum = 0
        memo.forEachIndexed { idx, v -> if (idx % 2 == 0) sum += v }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}