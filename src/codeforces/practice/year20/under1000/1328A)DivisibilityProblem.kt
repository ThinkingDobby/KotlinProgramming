package codeforces.practice.under1000

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

        if (a % b != 0) {
            bw.write("${b * (a / b + 1) - a}")
        } else {
            bw.write("0")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}