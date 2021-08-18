package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val ans = br.readLine().split(" ").map{it.toInt()}.reduce{x, y -> x and y}
        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}