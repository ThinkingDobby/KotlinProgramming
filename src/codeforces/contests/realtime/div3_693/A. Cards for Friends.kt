package codeforces.contests.realtime.div3_693

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val w = st.nextToken().toInt()
        val h = st.nextToken().toInt()
        val n = st.nextToken().toInt()

        if (func(w) * func(h) >= n) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun func(num: Int): Int {
    if (num % 2 != 0) return 1
    else return 2 * func(num / 2)
}