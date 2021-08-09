package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        if (input.all { it == '0' } || input.all { it == '1' }) bw.write("$input")
        else bw.write("10".repeat(input.length))

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
