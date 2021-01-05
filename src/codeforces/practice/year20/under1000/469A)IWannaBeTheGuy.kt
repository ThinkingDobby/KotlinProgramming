package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val levels = Array(br.readLine().toInt() + 1) { false }
    levels[0] = true

    val pLevel = br.readLine().split(" ")
    val qLevel = br.readLine().split(" ")

    pLevel.forEachIndexed { idx, value -> if (idx != 0) levels[value.toInt()] = true }
    qLevel.forEachIndexed { idx, value -> if (idx != 0) levels[value.toInt()] = true }

    if (levels.all { it }) {
        bw.write("I become the guy.")
    } else {
        bw.write("Oh, my keyboard!")
    }

    bw.flush()
    bw.close()
}