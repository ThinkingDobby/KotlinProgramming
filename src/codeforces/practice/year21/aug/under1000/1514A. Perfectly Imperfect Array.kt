package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }

        var ans = false
        for (i in inputs) {
            val temp = Math.sqrt(i.toDouble())
            if (temp != Math.floor(temp)) {
                ans = true
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
