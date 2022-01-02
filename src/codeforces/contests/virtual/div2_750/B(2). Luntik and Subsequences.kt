package codeforces.contests.virtual.div2_750

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }

        val cnt0 = inputs.count { it == 0 }
        val cnt1 = inputs.count { it == 1 }

        var tmp = 1L
        bw.write("${cnt1 * (tmp shl cnt0)}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
