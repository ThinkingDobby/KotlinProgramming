package codeforces.practice.year21.may.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val s = br.readLine()

        var ans = ""

        for (i in s.indices step 2) {
            ans += s[i]
        }

        bw.write(ans)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
