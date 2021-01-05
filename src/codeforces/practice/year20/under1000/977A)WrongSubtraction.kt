package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    var n = st.nextToken().toInt()
    var k = st.nextToken().toInt()

    while (true) {
        if (k == 0) break
        if (n % 10 == 0) {
            n /= 10
            k -= 1
        } else {
            n -= 1
            k -= 1
        }
    }

    bw.write("$n")

    bw.flush()
    bw.close()
}