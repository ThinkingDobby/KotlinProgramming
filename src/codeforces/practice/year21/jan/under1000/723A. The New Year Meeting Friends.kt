package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val inputs = Array(3){st.nextToken().toInt()}.sorted()

    bw.write("${inputs[1] - inputs[0] + inputs[2] - inputs[1]}")

    bw.flush()
    bw.close()
}