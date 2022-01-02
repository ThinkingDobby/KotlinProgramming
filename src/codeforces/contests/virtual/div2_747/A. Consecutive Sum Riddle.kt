package codeforces.contests.virtual.div2_747

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toLong()
        bw.write("${-(n - 1)} $n")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
