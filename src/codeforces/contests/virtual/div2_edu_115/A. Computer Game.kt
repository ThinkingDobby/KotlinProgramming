package codeforces.contests.virtual.div2_edu_115

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val f = br.readLine()
        val s = br.readLine()

        var ans = true
        for (i in 0 until n) {
            if (f[i] == '1' && s[i] == '1') {
                ans = false
                break
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
