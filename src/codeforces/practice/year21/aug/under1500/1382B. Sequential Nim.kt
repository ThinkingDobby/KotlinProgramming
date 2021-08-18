package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }

        val ans = input.indexOfFirst { it > 1 }
        if (ans == -1) if (input.count {it == 1} % 2 == 0) bw.write("Second") else bw.write("First")
        else {
            if (ans % 2 == 0) bw.write("First")
            else bw.write("Second")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}