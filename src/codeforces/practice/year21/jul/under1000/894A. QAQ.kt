package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val len = input.length

    var count = 0
    for (i in 0 until len - 2) {
        if (input[i] == 'Q') {
            for (j in i + 1 until len - 1) {
                if (input[j] == 'A') {
                    for (k in j + 1 until len) {
                        if (input[k] == 'Q') count++
                    }
                }
            }
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}
