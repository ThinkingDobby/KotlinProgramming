package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var y = br.readLine().toInt()

    while (true) {
        y++
        val tmp = y.toString()
        val arr = Array(10) { false }
        for (i in tmp.indices) {
            arr[tmp[i].toInt() - 48] = true
        }

        if (arr.count { it } == tmp.length) {
            bw.write("$y")
            break
        }
    }

    bw.flush()
    bw.close()
}