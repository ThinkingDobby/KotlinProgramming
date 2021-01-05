package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    var a = st.nextToken().toInt()
    var b = st.nextToken().toInt()

    var year = 0
    while (true) {
        year++
        a *= 3
        b *= 2
        if (a > b) break
    }

    bw.write("$year")

    bw.flush()
    bw.close()
}