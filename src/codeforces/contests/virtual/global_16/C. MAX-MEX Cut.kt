package codeforces.contests.virtual.global_16

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val f = br.readLine()
        val s = br.readLine()

        var cnt = 0
        var i = 0
        while (i < n) {
            if (f[i] == '0' && s[i] == '0') {
                if (i + 1 < n && f[i + 1] == '1' && s[i + 1] == '1') {
                    cnt += 2
                    i++
                } else cnt++
            } else if ((f[i] - '0') + (s[i] - '0') == 1) {
                cnt += 2
            } else {
                if (i + 1 < n && f[i + 1] == '0' && s[i + 1] == '0') {
                    cnt += 2
                    i++
                }
            }
            i++
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}