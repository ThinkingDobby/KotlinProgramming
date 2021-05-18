package baekjoon.section17

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val st = StringTokenizer(br.readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        if (a == 0 && b == 0) break

        if (b % a == 0) bw.write("factor")
        else if (a % b == 0) bw.write("multiple")
        else bw.write("neither")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}