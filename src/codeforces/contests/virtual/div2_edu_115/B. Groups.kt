package codeforces.contests.virtual.div2_edu_115

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        val memo = Array(n) { IntArray(5) }
        for (i in 0 until n) {
            val st = StringTokenizer(br.readLine())
            for (j in 0 until 5) {
                memo[i][j] = st.nextToken().toInt()
            }
        }

        var ans = false
        a@ for (i in 0 until 5) {
            for (j in 0 until 5) {
                if (i == j) continue
                val f = mutableSetOf<Int>()
                val s = mutableSetOf<Int>()
                for (k in 0 until n) {
                    if (memo[k][i] == 1) f.add(k)
                    if (memo[k][j] == 1) s.add(k)
                }
                if (f.size >= n / 2 && s.size >= n / 2 && (f + s).size == n) {
                    ans = true
                    break@a
                }
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
