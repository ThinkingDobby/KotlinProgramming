package codeforces.practice.year22.jan

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val f = input.any { it == '>' }
        val s = input.any { it == '<' }
        val t = input.all { it == '=' }

        if (f && !s) {
            bw.write(">")
        } else if (!f && s) {
            bw.write("<")
        } else if (t) {
            bw.write("=")
        } else {
            bw.write("?")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
