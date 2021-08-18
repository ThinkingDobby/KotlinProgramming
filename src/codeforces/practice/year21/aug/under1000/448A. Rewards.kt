package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a1, a2, a3) = br.readLine().split(" ").map { it.toInt() }
    val (b1, b2, b3) = br.readLine().split(" ").map { it.toInt() }
    val n = br.readLine().toInt()

    val temp = Math.ceil(((a1 + a2 + a3).toDouble() / 5)) + Math.ceil((b1 + b2 + b3).toDouble() / 10)
    if (temp <= n) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}