package codeforces.contests.virtual.div3_725

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

        if (inputs.sum() % n == 0) {
            val temp = inputs.sum() / n
            bw.write("${inputs.count { it > temp }}")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
