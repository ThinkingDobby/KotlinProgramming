package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        val inputs = mutableSetOf<Int>()

        for (i in 0 until n) {
            inputs.add(st.nextToken().toInt())
        }

        bw.write("${inputs.size}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}