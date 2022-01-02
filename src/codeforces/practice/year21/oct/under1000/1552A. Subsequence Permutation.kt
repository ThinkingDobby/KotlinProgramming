package codeforces.practice.year21.oct.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val s = br.readLine().toMutableList()
        val ss = s.sorted()

        bw.write("${(0 until n).count { s[it] != ss[it] }}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
