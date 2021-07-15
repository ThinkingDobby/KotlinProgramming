package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val memo = ArrayList<Long>()

    for (i in 1..9) {
        var str = ""
        for (j in 1..9) {
            str += i
            memo.add(str.toLong())
        }
    }

    memo.sort()

    val t = br.readLine().toInt()
    for (k in 0 until t) {
        val n = br.readLine().toInt()
        if (n >= memo.last()) {
            bw.write("${memo.size}")
        } else {
            for (i in memo.indices) {
                if (memo[i] > n) {
                    bw.write("$i")
                    break
                }
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
