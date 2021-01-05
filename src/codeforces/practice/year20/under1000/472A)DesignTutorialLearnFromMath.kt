package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    if (n % 2 == 0) {
        bw.write("4 ${n - 4}")
    } else {
        bw.write("9 ${n - 9}")
    }

    bw.flush()
    bw.close()
}