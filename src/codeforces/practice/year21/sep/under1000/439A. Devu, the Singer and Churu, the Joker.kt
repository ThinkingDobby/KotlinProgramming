package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, d) = br.readLine().split(" ").map { it.toInt() }
    val inputs = br.readLine().split(" ").map { it.toInt() }

    var cnt = 0
    var ans = true
    var sum = inputs[0]
    if (sum > d) ans = false
    for (i in 1 until n) {
        if (sum + 10 + inputs[i] > d) {
            ans = false
            break
        }
        cnt += 2
        sum += 10 + inputs[i]
    }

    if (ans) {
        cnt += (d - sum) / 5
        bw.write("$cnt")
    } else {
        bw.write("-1")
    }

    bw.flush()
    bw.close()
}
