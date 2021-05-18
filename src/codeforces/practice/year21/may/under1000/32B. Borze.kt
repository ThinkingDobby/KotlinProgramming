package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    var i = 0
    var ans = ""
    while (true) {
        if (i >= input.length) break
        if (input[i] == '.') {
            ans += 0
        } else if (input[i] == '-') {
            if (i < input.length - 1 && input[i + 1] == '.') {
                ans += 1
            }
            if (i < input.length - 1 && input[i + 1] == '-') {
                ans += 2
            }
            i++
        }
        i++
    }

    bw.write(ans)

    bw.flush()
    bw.close()
}