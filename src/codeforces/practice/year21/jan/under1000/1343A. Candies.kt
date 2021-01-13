package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        var ans = 0L
        var now = 2L
        while (true) {
            now *= 2
            if (n % (now - 1) == 0L) {
                ans = n / (now - 1)
                break
            }
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}