package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val first = st.nextToken().toInt()

    var count = 0
    var min = first
    var max = first


    repeat(n - 1) {
        val tmp = st.nextToken().toInt()
        if (tmp < min) {
            count++
            min = tmp
        }
        if (tmp > max) {
            count++
            max = tmp
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}