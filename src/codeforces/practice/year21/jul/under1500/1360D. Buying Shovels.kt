package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }

        var i = 1
        var ans = 1
        while (i * i <= n) {
            if (n % i == 0) {
                if (i <= k) ans = maxOf(ans, i)
                if (n / i <= k) ans = maxOf(ans, n / i)
            }
            i++
        }

        bw.write("${n / ans}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
