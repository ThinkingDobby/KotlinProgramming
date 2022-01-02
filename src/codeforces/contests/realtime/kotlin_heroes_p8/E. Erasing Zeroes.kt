package codeforces.contests.realtime.kotlin_heroes_p8

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val f = input.indexOfFirst { it == '1' }
        val s = input.indexOfLast { it == '1' }
        if (f == -1) bw.write("0")
        else bw.write("${input.subSequence(f, s + 1).count { it == '0' }}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
