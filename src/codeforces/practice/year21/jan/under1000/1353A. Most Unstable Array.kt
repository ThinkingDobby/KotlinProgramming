package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        if (n == 1) {
            bw.write("0")
        } else if (n == 2) {
            bw.write("$m")
        } else {
            bw.write("${m * 2}")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}