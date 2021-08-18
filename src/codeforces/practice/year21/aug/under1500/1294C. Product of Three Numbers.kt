package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine().toInt()
        var n = input

        var i = 2
        var first = 1
        var second = 1
        var third = 1

        while (i * i <= input) {
            if (n % i == 0) {
                if (first == 1) first = i
                else if (second == 1) {
                    second = i
                    if (i < n / i) third = n / i
                }
                n /= i

                if (first != 1 && second != 1 && third != 1) break
            }

            i++
        }

        if (first != 1 && second != 1 && third != 1) {
            bw.write("YES")
            bw.newLine()
            bw.write("$first $second $third")
        } else {
            bw.write("NO")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}