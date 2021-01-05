package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        val t = br.readLine()

        if (t.length > 10) bw.write("${t.first()}${t.length - 2}${t.last()}")
        else bw.write(t)

        bw.newLine()
    }

    bw.flush()
    bw.close()
}