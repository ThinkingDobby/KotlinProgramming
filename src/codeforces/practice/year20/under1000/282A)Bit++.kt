package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var x = 0
    repeat(n) {
        val input = br.readLine()
        when (input) {
            "X++" -> x++
            "X--" -> x--
            "++X" -> x++
            "--X" -> x--
        }
    }

    bw.write("$x")

    bw.flush()
    bw.close()
}