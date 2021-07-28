package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var ans = 0L

    var now = 1
    for (i in n - 1 downTo 1) {
        ans += now * i
        now++
    }

    ans += n
    bw.write("$ans")

    bw.flush()
    bw.close()
}