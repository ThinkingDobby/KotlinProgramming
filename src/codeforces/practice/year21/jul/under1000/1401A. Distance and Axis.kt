package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }

        if (k > n) bw.write("${k - n}")
        else {
            if (k % 2 == n % 2) bw.write("0")
            else bw.write("1")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}