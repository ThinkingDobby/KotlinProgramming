package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val f = br.readLine().toCharArray()
    val s = br.readLine().toCharArray()

    var fSum = 0
    var sSum = 0
    var qCnt = 0

    f.forEach { if (it == '+') fSum++ else fSum-- }
    s.forEach { if (it == '+') sSum++ else if (it == '-') sSum-- else qCnt++ }

    val temp = Math.abs(fSum - sSum)
    if (temp <= qCnt) {
        if (qCnt == 0) bw.write("1")
        else {
            bw.write("${comb(qCnt, (qCnt - temp) / 2 + temp, 10) / Math.pow(2.0, qCnt.toDouble())}")
        }
    } else {
        bw.write("0")
    }

    bw.flush()
    bw.close()
}

private fun comb(a: Int, b: Int, max: Int): Int {
    val comb = Array(max + 1) { Array(max + 1) { 1 } }
    for (i in 2..max) {
        for (j in 0..i) {
            if (j == 0 || j == i) comb[i][j] = 1
            else comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]
        }
    }

    return comb[a][b]
}