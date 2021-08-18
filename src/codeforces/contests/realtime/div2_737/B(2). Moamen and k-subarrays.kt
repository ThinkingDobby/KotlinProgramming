package codeforces.contests.realtime.div2_737

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }

        val st = StringTokenizer(br.readLine())
        val memo = mutableListOf<Pair<Int, Int>>()

        for (i in 0 until n) {
            memo.add(st.nextToken().toInt() to i)
        }

        memo.sortBy { it.first }

        var cnt = 0
        for (i in 1 until n) {
            if (memo[i].second == memo[i - 1].second + 1) cnt++
        }

        if (n - cnt > k) bw.write("No")
        else bw.write("Yes")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
