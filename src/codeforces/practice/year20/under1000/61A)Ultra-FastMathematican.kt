package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstInput = br.readLine()
    val secondInput = br.readLine()

    for (i in firstInput.indices) {
        if (firstInput[i] != secondInput[i]) {
            bw.write("1")
        } else {
            bw.write("0")
        }
    }

    bw.flush()
    bw.close()
}