package codeforces.contests.realtime.div3_693

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        var candy1 = 0
        var candy2 = 0

        val st = StringTokenizer(br.readLine())

        for (i in 0 until n) {
            val tmp = st.nextToken().toInt()
            if (tmp == 1) candy1++
            else candy2++
        }

        var ans = false
        if (candy2 % 2 == 0) {
            if (candy1 % 2 == 0) {
                ans = true
            }
        } else {
            if (candy1 % 2 == 0 && candy1 != 0) {
                ans = true
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}