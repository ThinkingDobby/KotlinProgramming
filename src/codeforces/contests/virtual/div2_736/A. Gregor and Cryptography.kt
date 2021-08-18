package codeforces.contests.virtual.div2_736

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val p = br.readLine().toLong()
        bw.write("2 ${p - 1}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
