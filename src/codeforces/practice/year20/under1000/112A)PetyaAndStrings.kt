package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstString = br.readLine().toLowerCase()
    val secondString = br.readLine().toLowerCase()

    val ans = if (firstString < secondString) -1
    else if (firstString == secondString) 0
    else 1

    bw.write("$ans")

    bw.flush()
    bw.close()
}