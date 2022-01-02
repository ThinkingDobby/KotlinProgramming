package codeforces.contests.virtual.div2_750

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

        val ac = c % 2
        val bc = b % 2

        var cnt = 0
        if (ac == 1 && bc == 1) cnt += 1
        else if (ac == 0 && bc == 1) cnt += 2
        else if (ac == 1 && bc == 0) cnt += 1

        if (a > cnt) cnt = (a - cnt) % 2
        else cnt -= a

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
