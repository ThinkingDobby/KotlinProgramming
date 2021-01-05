package baekjoon.section16

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())
    val inputs = Array(n) { st.nextToken().toInt() }

    for (i in 1 until n) {
        val tmp = gcdResult(inputs[0], inputs[i])
        bw.write("${inputs[0] / tmp}/${inputs[i] / tmp}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun gcdResult(a: Int, b: Int): Int {
    return if (b == 0) a else gcdResult(b, a % b)
}