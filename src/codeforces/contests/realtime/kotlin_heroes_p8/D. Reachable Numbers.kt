package codeforces.contests.realtime.kotlin_heroes_p8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toLong()
    val ans = mutableListOf<Long>()
    while (true) {
        if (n in ans) break
        ans.add(n)
        n = f(n)
    }

    bw.write("${ans.size}")

    bw.flush()
    bw.close()
}

private fun f(n: Long): Long {
    return (n + 1).toString().replace("0+$".toRegex(), "").toLong() - "0".toLong()
}