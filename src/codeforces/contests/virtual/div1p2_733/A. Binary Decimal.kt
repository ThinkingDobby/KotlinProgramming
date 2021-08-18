package codeforces.contests.virtual.div1p2_733

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().map{ it - '0' }
        bw.write("${n.max()}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
