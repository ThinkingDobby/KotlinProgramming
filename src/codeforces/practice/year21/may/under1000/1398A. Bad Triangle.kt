package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toLong() }

        if (inputs[0] + inputs[1] <= inputs.last()) {
            bw.write("1 2 $n")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
