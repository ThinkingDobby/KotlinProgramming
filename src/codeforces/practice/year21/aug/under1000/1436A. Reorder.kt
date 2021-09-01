package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine().split(" ").map { it.toInt() }.sum()
        if (input == m) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}