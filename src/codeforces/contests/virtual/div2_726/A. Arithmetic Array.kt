package codeforces.contests.virtual.div2_726

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()

        var sum = 0L
        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            sum += st.nextToken().toInt()
        }

        var ans = 0L
        if (sum < n) {
            ans = 1
        } else {
            ans = sum - n
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
