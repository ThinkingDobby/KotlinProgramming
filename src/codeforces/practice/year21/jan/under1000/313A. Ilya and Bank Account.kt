package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    if (n >= 0) bw.write("$n")
    else {
        n = -n
        val tmp = n / 10
        bw.write("${-Math.min(tmp, tmp - tmp % 10 + n % 10)}")
    }

    bw.flush()
    bw.close()
}