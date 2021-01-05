package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val k = st.nextToken().toInt()
    val n = st.nextToken().toInt()
    val w = st.nextToken().toInt()

    var sum = 0
    for (i in 1..w) {
        sum += i * k
    }

    val ans = sum - n
    if (sum - n > 0) bw.write("$ans")
    else bw.write("0")

    bw.flush()
    bw.close()
}