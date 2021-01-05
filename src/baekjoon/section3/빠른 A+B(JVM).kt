package practice.baekjoon.section3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..br.readLine().toInt()) {
        val input = readLine()!!.split(" ")
        bw.write("${input[0].toInt() + input[1].toInt()}\n")
        bw.flush()
    }

    br.close()
    bw.close()
}