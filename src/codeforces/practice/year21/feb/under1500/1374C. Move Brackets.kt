package codeforces.practice.year21.feb.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val input = br.readLine()

        var openCount = 0
        var ansCount = 0
        for (i in 0 until n) {
            if (input[i] == '(') openCount++
            else {
                if (openCount == 0) {
                    ansCount++
                } else {
                    openCount--
                }
            }
        }

        bw.write("$ansCount")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}