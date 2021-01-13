package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val t = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val inputs = Array(n){0}
    for (i in 1 until n) {
        inputs[i] = st2.nextToken().toInt()
    }

    val memo = Array(n + 1) { false }

    var now = 1
    while (true) {
        memo[now] = true
        if (now > t || now >= n) break
        now += inputs[now]
    }


    if (memo[t]) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}