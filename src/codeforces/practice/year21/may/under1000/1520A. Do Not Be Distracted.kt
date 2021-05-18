package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val memo = Array(26) { false }
        val n = br.readLine().toInt()
        var input = br.readLine()
        input += 's'
        var ans = true

        for (i in 1 until input.length) {
            if (input[i - 1] != input[i]) {
                if (!memo[input[i - 1].toInt() - 'A'.toInt()]) {
                    memo[input[i - 1].toInt() - 'A'.toInt()] = true
                } else {
                    ans = false
                    break
                }
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
