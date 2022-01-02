package codeforces.contests.virtual.div2_edu_116

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine().toMutableList()
        val fIdx = input.lastIndexOf(input.first())
        if (fIdx != input.size - 1) input[input.size - 1] = input[fIdx]
        bw.write("${input.joinToString("")}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
