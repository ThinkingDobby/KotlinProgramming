package codeforces.practice.year21.may.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val q = br.readLine().toInt()
    repeat(q) {
        val st = StringTokenizer(br.readLine())
        var sum = 0L
        repeat(3) {
            sum += st.nextToken().toLong()
        }

        bw.write("${sum / 2}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
