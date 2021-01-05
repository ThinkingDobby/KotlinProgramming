package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()

    var ans = 0
    if (x % 5 == 0) {
        ans = x / 5
    } else {
        ans = x / 5 + 1
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}