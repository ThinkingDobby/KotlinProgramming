package practice.baekjoon.section9

import java.io.*
import kotlin.math.PI

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val r = br.readLine().toDouble()

    bw.write("${r * r * PI}\n")
    bw.write("${r * r * 2.0}")

    bw.flush()
    bw.close()
}