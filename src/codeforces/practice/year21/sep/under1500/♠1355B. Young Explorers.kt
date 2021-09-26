package codeforces.practice.year21.sep.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val memo = mutableMapOf<Int, Int>()
        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            val tmp = st.nextToken().toInt()
            memo[tmp] = (memo[tmp] ?: 0) + 1
        }

        var cnt = 0
        var sum = 0
        for (i in memo.keys.sorted()) {
            sum += (cnt + memo[i]!!) / i
            cnt = (cnt + memo[i]!!) % i
        }

        bw.write("$sum")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}