package codeforces.contests.virtual.div3_702

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

        var count = 0
        for (i in 1 until n) {
            var max = Math.max(inputs[i - 1], inputs[i])
            var min = Math.min(inputs[i - 1], inputs[i])

            if (max > min * 2) {
                while (max > min * 2) {
                    min *= 2
                    count++
                }
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}