package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())

    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val items = Array(m) { st2.nextToken().toInt() }.sorted()

    var min = Int.MAX_VALUE
    for (i in 0..m - n) {
        val tmpArr = items.slice(i until i + n)
        val tmp = tmpArr.last() - tmpArr.first()
        if (tmp < min) min = tmp
    }

    bw.write("$min")

    bw.flush()
    bw.close()
}