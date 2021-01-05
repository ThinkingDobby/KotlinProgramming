package practice.baekjoon.section7

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 1..t) {
        val st = StringTokenizer(br.readLine())
        val r = st.nextToken().toInt()
        val s = st.nextToken()

        for (i in 0 until s.length) {
            for (j in 1..r) {
                bw.write(s[i].toString())
            }
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}