package codeforces.contests.virtual.div2_728

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        if (n % 2 == 0) {
            for (i in 1..n / 2) {
                bw.write("${2 * i} ${2 * i - 1} ")
            }
        } else {
            for (i in 1..n / 2 - 1) {
                bw.write("${2 * i} ${2 * i - 1} ")
            }
            bw.write("$n ${n - 2} ${n - 1}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
