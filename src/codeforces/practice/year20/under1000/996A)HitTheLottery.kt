package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var tmp = n
    var count = 0
    while (true) {
        if (tmp == 0) break
        if (tmp >= 100) {
            count += tmp / 100
            tmp %= 100
        } else if (tmp >= 20) {
            count += tmp / 20
            tmp %= 20
        } else if (tmp >= 10) {
            count += tmp / 10
            tmp %= 10
        } else if (tmp >= 5) {
            count += tmp / 5
            tmp %= 5
        } else if (tmp >= 1) {
            count += tmp
            tmp = 0
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}