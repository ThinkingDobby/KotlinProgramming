package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val f = input.indexOf('1')
        val l = input.lastIndexOf('1')

        var cnt = 0
        for (i in f until l) {
            if (input[i] == '0') cnt++
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
