package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val inputs = Array(n) { br.readLine() }

        val memo = Array(26) { 0 }

        for (i in inputs) {
            for (j in i) {
                memo[j.toInt() - 'a'.toInt()]++
            }
        }

        var ans = true
        for (i in memo) {
            if (i % n != 0) {
                ans = false
                break
            }
        }

        if (ans) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
