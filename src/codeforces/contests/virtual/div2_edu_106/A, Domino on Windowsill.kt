package codeforces.contests.virtual.div2_edu_106

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k1, k2) = br.readLine().split(" ").map { it.toInt() }
        val (w, b) = br.readLine().split(" ").map { it.toInt() }
        val min = minOf(k1, k2)
        val max = maxOf(k1, k2)
        val tmp = max - min

        if (tmp / 2 + min >= w && tmp / 2 + n - max >= b) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
