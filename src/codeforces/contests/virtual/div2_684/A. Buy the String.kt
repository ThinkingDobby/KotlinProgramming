package codeforces.contests.virtual.div2_684

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val c0 = st.nextToken().toInt()
        val c1 = st.nextToken().toInt()
        val h = st.nextToken().toInt()

        val inputs = br.readLine()

        if (c0 > c1 + h) {
            bw.write("${c1 * inputs.count { it == '1' } + (c1 + h) * inputs.count { it == '0' }}")
        } else if (c1 > c0 + h) {
            bw.write("${c0 * inputs.count { it == '0' } + (c0 + h) * inputs.count { it == '1' }}")
        } else {
            bw.write("${c1 * inputs.count { it == '1' } + c0 * inputs.count { it == '0' }}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}