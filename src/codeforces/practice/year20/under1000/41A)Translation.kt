package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstInput = br.readLine()
    val secondInput = br.readLine()

    if (secondInput == firstInput.reversed()) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}