package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        var ans = 0
        if (n % 2 == 0) {
            ans = n / 2 - 1
        } else {
            ans = n / 2
        }

        if (ans < 0) ans = 0

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
