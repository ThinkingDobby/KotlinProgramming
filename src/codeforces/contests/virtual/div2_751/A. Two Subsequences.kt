package codeforces.contests.virtual.div2_751

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val s = br.readLine().toMutableList()
        val min = s.min()
        s.remove(min)
        bw.write("$min ${s.joinToString("") }")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
