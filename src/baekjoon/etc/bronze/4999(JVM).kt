package practice.baekjoon.etc.bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val doctor = br.readLine()

    if (input.length >= doctor.length) bw.write("go")
    else bw.write("no")

    bw.flush()
    bw.close()
}