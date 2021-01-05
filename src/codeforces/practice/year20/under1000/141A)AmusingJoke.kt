package codeforces.practice.year20.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val firstInput = br.readLine()
    val secondInput = br.readLine()
    val letters = br.readLine()

    if ((firstInput + secondInput).toList().sorted() == letters.toList().sorted()) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}