package codeforces.practice.year21.aug.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        if (n <= 3) bw.write("${n - 1}")
        else if (n % 2 == 0) bw.write("2")
        else bw.write("3")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
