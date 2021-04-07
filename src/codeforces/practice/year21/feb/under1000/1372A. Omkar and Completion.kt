package codeforces.practice.year21.feb.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        repeat(n) {
            bw.write("1 ")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}