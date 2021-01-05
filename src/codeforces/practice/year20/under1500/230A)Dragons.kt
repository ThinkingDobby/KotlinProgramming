package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    var s = st1.nextToken().toInt()
    val n = st1.nextToken().toInt()

    val dragons = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val st2 = StringTokenizer(br.readLine())
        dragons.add(st2.nextToken().toInt() to st2.nextToken().toInt())
    }

    dragons.sortBy { it.first }

    var win = true
    for (i in 0 until n) {
        if (s > dragons[i].first) {
            s += dragons[i].second
        } else {
            win = false
        }
    }

    if (win) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
}