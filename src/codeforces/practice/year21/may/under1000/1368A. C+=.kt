package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        var a = st.nextToken().toInt()
        var b = st.nextToken().toInt()
        val n = st.nextToken().toInt()

        var count = 0

        while (true) {
            if (a > n || b > n) break
            if (a > b) b += a
            else a += b
            count++
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
