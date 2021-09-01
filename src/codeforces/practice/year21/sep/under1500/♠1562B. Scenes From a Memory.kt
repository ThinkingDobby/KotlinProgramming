package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val tmp = era(100)
    val memo = mutableListOf<String>()
    for (i in 1 until tmp.size) {
        if (!tmp[i]) memo.add(i.toString())
    }

    repeat(br.readLine().toInt()) {
        val k = br.readLine().toInt()
        val n = br.readLine()

        for (i in memo) {
            val tmp = i.toCharArray().joinToString(".*")
            if ((tmp.toRegex()) in n) {
                bw.write("${i.length}")
                bw.newLine()
                bw.write("$i")
                break
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

private fun era(n: Int): Array<Boolean> {
    val primeNumbers = Array(n + 1) { true }
    primeNumbers[0] = false
    primeNumbers[1] = false

    for (i in 2..n) {
        if (primeNumbers[i]) {
            for (j in 2 * i..n step i) primeNumbers[j] = false
        }
    }

    return primeNumbers
}