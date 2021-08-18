package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b, c, d) = br.readLine().split(" ").map { it.toLong() }

        if (a <= b) bw.write("$b")
        else {
            if (c <= d) bw.write("-1")
            else {
                bw.write("${(b + Math.ceil((a - b).toDouble() / (c - d)).toLong() * c)}")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
