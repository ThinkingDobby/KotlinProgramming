package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().split("WUB")
    input.forEach { if (it != "") bw.write("$it ") }

    bw.flush()
    bw.close()
}