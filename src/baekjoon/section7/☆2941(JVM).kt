package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cro = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var input = br.readLine()

    for (i in cro.indices) {
        if (input.contains(cro[i])) input = input.replace(cro[i], "*")
    }

    bw.write("${input.length}")
    bw.flush()
    bw.close()
}