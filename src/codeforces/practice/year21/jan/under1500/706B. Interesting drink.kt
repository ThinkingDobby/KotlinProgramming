package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val shops = Array(n) { st.nextToken().toLong() }.sorted()
    val q = br.readLine().toInt()
    val days = Array(q) { br.readLine().toLong() to it }.sortedBy { it.first }
    val tmp = Array(q) {0}

    var prevCount = 0
    var prevIndex = 0
    for (i in 0 until q) {
        var count = prevCount
        val index = prevIndex

        for (j in index until n) {
            if (shops[j] <= days[i].first) {
                count++
                prevIndex++
            } else {
                tmp[days[i].second] = count
                break
            }
        }
        prevCount = count
        tmp[days[i].second] = count
    }

    tmp.forEach { bw.write("$it\n") }

    bw.flush()
    bw.close()
}