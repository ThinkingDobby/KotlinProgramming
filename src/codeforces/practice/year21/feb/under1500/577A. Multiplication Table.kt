package codeforces.practice.year21.feb.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()

    var count = 0
    for (i in 1..n) {
        if (x % i == 0) {
            if (x / i <= n) count++
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}