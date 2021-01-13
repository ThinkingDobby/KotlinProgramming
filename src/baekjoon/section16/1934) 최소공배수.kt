package baekjoon.section16

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        bw.write("${a * b / func(a, b)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun func(a: Int, b: Int): Int {
    return if (b == 0) a else func(b, a % b)
}