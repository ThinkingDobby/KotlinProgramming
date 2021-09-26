package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toInt()
        val input = br.readLine().split(" ").map { it.toInt() }
        val odds = mutableListOf<Int>()
        val evens = mutableListOf<Int>()

        input.forEachIndexed { index, i -> if (i % 2 == 0) evens.add(index + 1) else odds.add(index + 1) }

        var tot = n - 1
        var cnt = 0
        for (i in 0 until odds.size - 1 step 2) {
            if (tot <= cnt) break
            bw.write("${odds[i]} ${odds[i + 1]}")
            cnt++
            bw.newLine()
        }

        for (i in 0 until evens.size - 1 step 2) {
            if (tot <= cnt) break
            bw.write("${evens[i]} ${evens[i + 1]}")
            cnt++
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}

