package codeforces.contests.realtime.div2_edu_111

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        val input = br.readLine()

        var count0 = 0
        var count1 = 0
        for (i in 0 until n) {
            if (input[i] == '0') count0++
            else count1++
        }

        var sum = a * n
        if (b >= 0) {
            sum += b * n
        } else {
            var first = input[0]
            var firstCount = 1
            var secondCount = 0
            for (i in 0 until n - 1) {
                if (input[i] != input[i + 1]) {
                    if (input[i + 1] == first) firstCount++
                    else secondCount++
                }
            }
            sum += (Math.min(firstCount, secondCount) + 1) * b
        }

        bw.write("$sum")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}