package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, c) = br.readLine().split(" ").map { it.toLong() }

        if (a >= c) bw.write("-1 $b")
        else if (a <= c / b) bw.write("1 -1")
        else bw.write("1 $b")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
