package codeforces.practice.year21.jan.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = br.readLine().toInt()
    val tmp = x.toString(2)

    bw.write("${tmp.count{it == '1'}}")

    bw.flush()
    bw.close()
}