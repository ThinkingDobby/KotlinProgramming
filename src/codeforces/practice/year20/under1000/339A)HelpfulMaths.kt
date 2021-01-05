package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toMutableList().filter { it != '+' }.sorted()

    for (i in input.indices) {
        if (i == 0) bw.write("${input[i]}")
        else bw.write("+${input[i]}")
    }

    bw.flush()
    bw.close()
}