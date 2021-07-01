package codeforces.practice.year21.may.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val x = br.readLine()

        var ans1 = ""
        var ans2 = ""
        var target = x.indexOf("1")

        if (target == -1) target = n
        ans1 += x.slice(0 until target).toBigInteger() / 2.toBigInteger()
        ans2 += x.slice(0 until target).toBigInteger() / 2.toBigInteger()
        if (target < n) {
            ans1 += 1
            ans2 += 0

            ans1 += "0".repeat(n - (target + 1))
            ans2 += x.slice(target + 1 until n)
        }

        bw.write(ans1)
        bw.newLine()
        bw.write(ans2)
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
