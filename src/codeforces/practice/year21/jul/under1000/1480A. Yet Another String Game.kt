package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        for (i in input.indices) {
            if (i % 2 == 0) {
                if (input[i] == 'a') bw.write("b")
                else bw.write("a")
            } else {
                if (input[i] == 'z') bw.write("y")
                else bw.write("z")
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
