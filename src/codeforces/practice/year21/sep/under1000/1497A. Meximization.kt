package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        inputs.sort()
        inputs.add(-1)
        val memo = mutableListOf<Int>()
        for (i in 0 until n) {
            if (inputs[i] == inputs[i + 1]) memo.add(inputs[i])
            else bw.write("${inputs[i]} ")
        }
        memo.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}