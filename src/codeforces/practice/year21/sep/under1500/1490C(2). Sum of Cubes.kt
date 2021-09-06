package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val x = br.readLine().toLong()
        var ans = false

        var a = 1L
        var b = 10000L
        while (a <= b) {
            while (a * a * a + b * b * b > x && b > 1) b--

            if (a * a * a + b * b * b == x) {
                ans = true
                break
            }

            a++
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}