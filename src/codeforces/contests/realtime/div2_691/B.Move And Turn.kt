package codeforces.contests.realtime.div2_691

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val c = n / 2 + 1
    if (n % 2 == 0) {
        bw.write("${c * c}")
    } else {
        bw.write("${c * (c + 1) * 2}")
    }

    bw.flush()
    bw.close()
}