package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (n, x) = br.readLine().split(" ").map { it.toLong() }
    var count = 0

    repeat(n.toInt()) {
        val st = StringTokenizer(br.readLine())
        val op = st.nextToken()
        val d = st.nextToken().toLong()

        if (op == "+") {
            x += d
        } else {
            if (d <= x) {
                x -= d
            } else {
                count++
            }
        }
    }

    bw.write("$x $count")

    bw.flush()
    bw.close()
}

