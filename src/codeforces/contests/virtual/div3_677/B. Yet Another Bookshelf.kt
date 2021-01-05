package codeforces.contests.virtual.div3_677

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

        var sum = 0
        var count = 0
        var start = false
        for (i in inputs) {
            if (i == 1) {
                start = true
            }
            if (start) {
                if (i == 0) count++
                else {
                    sum += count
                    count = 0
                }
            }
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}