package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toMutableList()
    input[0] = input[0].toUpperCase()

    input.forEach { bw.write("$it") }

    bw.flush()
    bw.close()
}