package practice.baekjoon.etc.silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    for (i in Math.min(a, b) downTo 1) {
        if (a % i == 0 && b % i == 0) {
            bw.write("$i\n")
            break
        }
    }

    var i = Math.max(a, b)
    while (true) {
        if (i % a == 0 && i % b == 0) {
            bw.write("$i")
            break
        }
        i++
    }

    bw.flush()
    bw.close()
}