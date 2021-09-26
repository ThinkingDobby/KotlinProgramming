package algorithm

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val ans = input.replace("^(0+)".toRegex(), "").let { if (it.isEmpty()) "0" else it }
    bw.write("$ans")

    bw.flush()
    bw.close()
}