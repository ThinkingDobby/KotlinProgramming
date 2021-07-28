package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        for (i in 0 until 9) {
            val input = br.readLine().toCharArray()
            input[input.indexOf('2')] = '1'
            input.forEach { bw.write("$it") }
            bw.newLine()
        }
    }

    bw.flush()
    bw.close()
}
