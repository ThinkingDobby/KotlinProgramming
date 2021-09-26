package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val inputs = br.readLine().split(" ").map { it.toLong() }.sorted()

    var ans = false
    for (i in 2 until n) {
        if (inputs[i - 2] + inputs[i - 1] > inputs[i]) {
            ans = true
            break
        }
    }

    if (ans) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}