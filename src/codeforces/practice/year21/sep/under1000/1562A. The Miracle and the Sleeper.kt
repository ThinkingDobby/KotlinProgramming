package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (l, r) = br.readLine().split(" ").map { it.toInt() }
        if (l <= r / 2 + 1) bw.write("${r % (r / 2 + 1)}")
        else bw.write("${r % l}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
