package baekjoon.etc.bronze

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

        var ans = 1
        repeat(b) {
            ans *= a
            ans %= 10
        }

        if (ans == 0) ans = 10
        bw.write("${ans}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}