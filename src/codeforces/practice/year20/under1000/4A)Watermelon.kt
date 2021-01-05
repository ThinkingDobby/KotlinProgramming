package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val w = br.readLine().toInt()

    if (w == 2) bw.write("NO")
    else if (w % 2 == 0) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}