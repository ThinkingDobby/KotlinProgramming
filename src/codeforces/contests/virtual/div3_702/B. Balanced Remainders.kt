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
        val inputs = Array(n) { st.nextToken().toLong() }

        val count = Array(3) { 0 }
        for (i in 0 until n) {
            count[(inputs[i] % 3).toInt()]++
        }

        val max = count.max()!!
        val maxIdx = count.indexOf(max)

        var ans = 0

        var now = maxIdx
        while (true) {
            if (count.count { it == n / 3 } == 3) break
            if (count[now] > n / 3) {
                val temp = count[now] - n / 3
                ans += temp
                count[now] -= temp
                count[(now + 1) % 3] += temp
            }
            now = (now + 1) % 3
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}