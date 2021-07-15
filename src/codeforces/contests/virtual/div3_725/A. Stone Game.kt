package codeforces.contests.virtual.div3_725

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
        val sortedInputs = inputs.sorted()

        val minIdx = inputs.indexOf(sortedInputs[0])
        val maxIdx = inputs.indexOf(sortedInputs[n - 1])

        var ans = 0
        if (minIdx < maxIdx) {
            ans = Math.min(minIdx + 1 + n - maxIdx, Math.min(minIdx + 1 + maxIdx - minIdx, n - maxIdx + maxIdx - minIdx))
        } else {
            ans = Math.min(maxIdx + 1 + n - minIdx, Math.min(maxIdx + 1 + minIdx - maxIdx, n - minIdx + minIdx - maxIdx))
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}