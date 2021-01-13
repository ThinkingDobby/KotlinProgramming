package codeforces.practice.year21.jan.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()
        val ans = StringBuilder()

        ans.append(input[0])
        for (i in 1 until input.length step 2) {
            ans.append(input[i])
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}