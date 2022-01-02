package codeforces.practice.year21.sep.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        if (n == 2) bw.write("2")
        else {
            if (n % 2 == 0) bw.write("0")
            else bw.write("1")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
