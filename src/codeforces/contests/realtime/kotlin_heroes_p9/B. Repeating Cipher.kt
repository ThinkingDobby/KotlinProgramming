package codeforces.contests.realtime.kotlin_heroes_p9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val data = br.readLine()

    var i = 0
    var tmp = 1
    while (true) {
        bw.write("${data[i]}")

        i += tmp
        tmp += 1
        if (i >= n) {
            break
        }
    }

    bw.flush()
    bw.close()
}