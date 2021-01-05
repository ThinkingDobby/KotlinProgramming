package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    val tmpInput = input.filter { it != '{' && it != '}' && it != ',' && it != ' '}.toSet()

    bw.write("${tmpInput.size}")

    bw.flush()
    bw.close()
}