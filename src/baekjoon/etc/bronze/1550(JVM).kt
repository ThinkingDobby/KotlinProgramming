package baekjoon.etc.bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt(16)

    bw.write("$n")

    bw.flush()
    bw.close()
}