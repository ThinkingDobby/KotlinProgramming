package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val inputs = Array(r) { br.readLine().toCharArray() }.toMutableList()
    var cnt = 0
    for (i in 0 until r) {
        if ('S' !in inputs[i]) {
            for (j in 0 until c) {
                inputs[i][j] = 'X'
                cnt++
            }
        }
    }

    for (i in 0 until c) {
        var tmp = 0
        for (j in 0 until r) {
            if (inputs[j][i] == 'S') {
                tmp = 0
                break
            }
            if (inputs[j][i] == '.') tmp++
        }
        cnt += tmp
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}