package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val h = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        val tmp = 24 * 60

        bw.write("${tmp - (h * 60 + m)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
