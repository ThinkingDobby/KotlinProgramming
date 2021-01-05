package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    if (input.contains("1111111") || input.contains("0000000")) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}