package codeforces.contests.virtual.div3_739

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
        val gap = Math.abs(a - b)
        if (maxOf(a, b, c) > gap * 2) bw.write("-1")
        else {
            bw.write("${(c + gap - 1) % (gap * 2) + 1}")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
