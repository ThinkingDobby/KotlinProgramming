package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        val evens = mutableListOf<Int>()
        val odds = mutableListOf<Int>()

        for (i in 0 until n) {
            val tmp = st.nextToken().toInt()
            if (tmp % 2 == 0) evens.add(tmp)
            else odds.add(tmp)
        }

        if (evens.size % 2 == 0 && odds.size % 2 == 0) {
            bw.write("YES")
        } else {
            val new = (evens + odds).sorted()
            var ans = false
            for (i in 1 until n) {
                if (new[i - 1] + 1 == new[i]) {
                    ans = true
                    break
                }
            }

            if (ans) bw.write("YES")
            else bw.write("NO")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}