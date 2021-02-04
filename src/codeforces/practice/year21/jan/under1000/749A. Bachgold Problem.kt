package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    bw.write("${n / 2}")
    bw.newLine()
    if (n % 2 == 0) {
        repeat(n / 2) {
            bw.write("2 ")
        }
    } else {
        repeat(n / 2 - 1) {
            bw.write("2 ")
        }
        bw.write("3")
    }

    bw.flush()
    bw.close()
}