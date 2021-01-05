package practice.baekjoon.section8

import java.io.*
import java.util.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (z in 0 until t) {
        val st = StringTokenizer(br.readLine())
        val x = st.nextToken().toInt()
        val y = st.nextToken().toInt()

        val len = y - x

        val max = sqrt(len.toDouble())
        val roundMax = round(max)

        when {
            len <= 3 -> bw.write("$len\n")
            max > roundMax -> bw.write("${roundMax.toInt() * 2}\n")
            max <= roundMax -> bw.write("${roundMax.toInt() * 2 - 1}\n")
        }
    }

    bw.flush()
    bw.close()
}