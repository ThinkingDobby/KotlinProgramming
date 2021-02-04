package codeforces.contests.virtual.div3_697

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        var n = br.readLine().toInt()

        var count = 0
        while (true) {
            if (n < 2020) break
            n -= 2020
            count++
        }

        if (n <= count) {
            bw.write("YES")
        } else {
            bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}