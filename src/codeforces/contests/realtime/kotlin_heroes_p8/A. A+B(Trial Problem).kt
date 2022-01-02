package codeforces.contests.realtime.kotlin_heroes_p8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${a + b}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
