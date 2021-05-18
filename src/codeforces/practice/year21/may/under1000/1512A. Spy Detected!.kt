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
        val inputs = Array(n) { st.nextToken().toInt() }

        val sortedInputs = inputs.sortedArray()
        val tmp: Int

        if (sortedInputs[0] == sortedInputs[1]) {
            tmp = sortedInputs.last()
        } else {
            tmp = sortedInputs.first()
        }

        bw.write("${inputs.indexOf(tmp) + 1}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
