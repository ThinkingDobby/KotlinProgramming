package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        var min = Int.MAX_VALUE
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }.sorted()
        for (i in 1 until n) {
            if (Math.abs(inputs[i] - inputs[i - 1]) < min) min = Math.abs(inputs[i] - inputs[i - 1])
        }

        bw.write("$min")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}