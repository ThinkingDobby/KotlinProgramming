package codeforces.contests.realtime.div2_732

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        val first = Array(n) { br.readLine() }
        val last = Array(n - 1) { br.readLine() }

        val check = Array(m){IntArray(26){0}}

        for (i in 0 until m) {
            for (j in 0 until n) {
                check[i][first[j][i] - 'a']++
            }
        }

        for (i in 0 until m) {
            for (j in 0 until n - 1) {
                check[i][last[j][i] - 'a']--
            }
        }

        for (i in 0 until m) {
            bw.write("${'a' + check[i].indexOf(1)}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}