package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    for (tc in 0 until t) {
        val n = br.readLine().toInt()
        if (n % 4 != 0) {
            bw.write("NO")
            bw.newLine()
            continue
        }
        bw.write("YES")
        bw.newLine()

        for (i in 1..n / 2) {
            bw.write("${2 * i} ")
        }
        for (i in 1 until n / 2) {
            bw.write("${2 * i - 1} " )
        }

        bw.write("${n / 2 - 1 + n}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}