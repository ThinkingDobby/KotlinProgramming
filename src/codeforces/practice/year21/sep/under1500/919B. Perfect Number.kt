package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pn = mutableListOf<Int>()
    var i = 0
    while (true) {
        if (pn.size > 10000) break
        if (i.toString().sumBy { it - '0' } == 10) pn.add(i)
        i++
    }

    bw.write("${pn[br.readLine().toInt() - 1]}")

    bw.flush()
    bw.close()
}