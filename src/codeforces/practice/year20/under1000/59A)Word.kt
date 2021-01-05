package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    if (input.count { it in input.toUpperCase() } > input.length / 2) {
        bw.write(input.toUpperCase())
    } else {
        bw.write(input.toLowerCase())
    }

    bw.flush()
    bw.close()
}