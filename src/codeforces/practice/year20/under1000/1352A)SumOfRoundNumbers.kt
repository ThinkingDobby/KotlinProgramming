package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val input = br.readLine().reversed()

        bw.write("${input.count{it != '0'}}\n")

        var count = 0
        for (i in input) {
            if (i != '0') {
                bw.write("$i")
                for (j in 0 until count) {
                    bw.write("0")
                }
                bw.write(" ")
            }
            count++
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}