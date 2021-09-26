package codeforces.practice.year21.sep.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        var prevP = 0
        var prevC = 0
        var ans = true
        for (i in 0 until n) {
            val st = StringTokenizer(br.readLine())
            val p = st.nextToken().toInt()
            val c = st.nextToken().toInt()

            if (prevP > p || prevC > c || p - prevP < c - prevC) {
                ans = false
            }

            prevP = p
            prevC = c
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}