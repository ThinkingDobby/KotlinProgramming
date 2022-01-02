package codeforces.contests.realtime.div2_754

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a1, a2, a3) = br.readLine().split(" ").map { it.toInt() }
        val ans = Math.abs(((a1 + a3) - 2 * a2)) % 3 == 0

        if (ans) bw.write("0")
        else bw.write("1")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
