package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    while (true) {
        var s = 0
        var x = n
        while (x > 0) {
            s += x % 10
            x /= 10
        }
        if ((s % 4) == 0) break
        n++
    }

    bw.write("$n")

    bw.flush()
    bw.close()
}