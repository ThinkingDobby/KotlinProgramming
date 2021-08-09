package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        if (input.count { it == '0' } == 0) bw.write("$input")
        else if (input.count { it == '1' } == 0) bw.write("$input")
        else {
            for (i in input.indices) {
                bw.write("10")
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
