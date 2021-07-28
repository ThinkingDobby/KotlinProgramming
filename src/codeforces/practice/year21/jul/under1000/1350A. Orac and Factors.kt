package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var (n, k) = br.readLine().split(" ").map { it.toLong() }
        var check = 0L
        for (i in 2..n) {
            if (n % i == 0L) {
                check = i
                break
            }
        }

        n += check + (k - 1) * 2
        bw.write("$n")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}