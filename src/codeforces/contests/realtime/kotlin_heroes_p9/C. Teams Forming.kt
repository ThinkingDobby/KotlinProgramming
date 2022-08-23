package codeforces.contests.realtime.kotlin_heroes_p9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val data = br.readLine().split(" ").map { it.toInt() }.sorted()

    var cnt = 0
    for (i in 0 until n step 2) {
        cnt += data[i + 1] - data[i]
    }

    bw.write("$cnt")

    bw.flush()
    bw.close()
}