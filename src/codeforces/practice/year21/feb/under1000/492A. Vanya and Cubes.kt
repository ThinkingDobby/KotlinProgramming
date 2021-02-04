package codeforces.practice.year21.feb.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()

    val count = Array(n + 1){0}
    count[0] = 0
    for (i in 1 until n + 1) {
        count[i] = i + count[i - 1]
    }

    var ansCount = 0
    var i = 1
    while (true) {
        n -= count[i]
        if (n > 0) ansCount++
        else if (n == 0) {
            ansCount++
            break
        } else break
        i++
    }

    bw.write("$ansCount")

    bw.flush()
    bw.close()
}