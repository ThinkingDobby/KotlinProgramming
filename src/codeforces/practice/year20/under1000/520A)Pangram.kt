package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine()
    val input = br.readLine().toLowerCase()
    val alphabets = Array(26) { false }

    for (i in input) {
        alphabets[i.toInt() - 97] = true
    }

    if (false in alphabets) {
        bw.write("NO")
    } else {
        bw.write("YES")
    }

    bw.flush()
    bw.close()
}