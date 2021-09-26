package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()
        val f = input.indexOf('1')
        val l = input.lastIndexOf('0')

        if (f > l || f == -1 || l == -1) bw.write("$input")
        else {
            for (i in 0 until f) bw.write("${input[i]}")
            bw.write("0")
            for (i in l + 1 until n) bw.write("${input[i]}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
