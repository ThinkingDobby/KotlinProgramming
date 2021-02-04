package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(2 * n) { st.nextToken().toInt() }.toSet()

        inputs.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}