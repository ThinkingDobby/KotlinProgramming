package codeforces.practice.year21.feb.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    if (n % 2 == 0) {
        bw.write("Mahmoud")
    } else {
        bw.write("Ehab")
    }

    bw.flush()
    bw.close()
}