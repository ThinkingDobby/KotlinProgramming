package codeforces.contests.virtual.div2_681

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        var count = 0
        for (i in 0 until n) {
            bw.write("${4 * n - 2 * count} ")
            count++
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}