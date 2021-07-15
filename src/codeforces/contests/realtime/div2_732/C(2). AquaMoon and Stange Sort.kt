package codeforces.contests.realtime.div2_732

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

        val evenSort = inputs.filterIndexed { idx, _ -> idx % 2 == 0 }.sorted()
        val oddSort = inputs.filterIndexed { idx, _ -> idx % 2 == 1 }.sorted()

        var ans = true
        var prev = Int.MIN_VALUE
        for (i in 0 until n) {
            val now = if (i % 2 == 0) {
                evenSort[i / 2]
            } else {
                oddSort[i / 2]
            }

            if (prev > now) {
                ans = false
                break
            }
            prev = now
        }

        if (ans) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}