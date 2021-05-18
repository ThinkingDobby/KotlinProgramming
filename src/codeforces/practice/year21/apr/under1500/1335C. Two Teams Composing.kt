package codeforces.practice.year21.apr.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        val st = StringTokenizer(br.readLine())
        val inputs = Array(n) { st.nextToken().toInt() }.sortedArray()

        var max = 0
        var count = 1
        var uniqueCount = 1
        for (i in 1 until n) {
            if (inputs[i - 1] == inputs[i]) {
                count++
            } else {
                if (max < count) max = count
                count = 1
                uniqueCount++
            }
        }
        if (max < count) max = count

        var ans: Int

        if (uniqueCount == max) ans = max - 1
        else if (uniqueCount < max) ans = uniqueCount
        else ans = max

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}