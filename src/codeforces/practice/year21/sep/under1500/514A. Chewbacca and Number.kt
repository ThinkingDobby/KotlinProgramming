package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().map { it - '0' }.toMutableList()

    var other = false
    for (i in input.indices) {
        if (!other && input[i] == 9) {
            bw.write("9")
            other = true
        } else {
            other = true
            if (input[i] >= 5) bw.write("${9 - input[i]}")
            else bw.write("${input[i]}")
        }
    }

    bw.flush()
    bw.close()
}