package codeforces.practice.year22.jan

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }

    try {
        val tmp = input.toSet().toList().subList(0, 3).sorted()

        for (i in tmp) {
            bw.write("${input.indexOf(i) + 1} ")
        }
    } catch(e: Exception) {
        bw.write("-1 -1 -1")
    }

    bw.flush()
    bw.close()
}