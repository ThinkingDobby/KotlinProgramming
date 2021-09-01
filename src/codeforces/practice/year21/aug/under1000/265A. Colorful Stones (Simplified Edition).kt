package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val check = br.readLine()

    var i = 0
    var j = 0

    while (true) {
        if (input[i] == check[j]) i++
        j++
        if (i == input.length || j == check.length) break
    }

    bw.write("${i + 1}")

    bw.flush()
    bw.close()
}