package codeforces.contests.realtime.div3_690

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

        var left = 0
        var right = n - 1

        while (true) {
            if (left == right) {
                bw.write("${inputs[left]}")
                break
            }
            if (left > right) break
            bw.write("${inputs[left]} ")
            bw.write("${inputs[right]} ")
            left++
            right--
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}