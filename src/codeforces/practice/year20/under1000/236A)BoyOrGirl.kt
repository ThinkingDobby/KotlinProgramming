package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    val arr = Array(26) { false }

    for (i in input.indices) {
        arr[input[i].toInt() - 97] = true
    }

    val count = arr.count { it }

    if (count % 2 != 0) {
        bw.write("IGNORE HIM!")
    } else {
        bw.write("CHAT WITH HER!")
    }

    bw.flush()
    bw.close()
}