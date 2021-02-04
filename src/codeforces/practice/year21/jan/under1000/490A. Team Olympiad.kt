package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st = StringTokenizer(br.readLine())

    val first = mutableListOf<Int>()
    val second = mutableListOf<Int>()
    val third = mutableListOf<Int>()

    for (i in 0 until n) {
        val tmp = st.nextToken().toInt()
        if (tmp == 1) first.add(i + 1)
        if (tmp == 2) second.add(i + 1)
        if (tmp == 3) third.add(i + 1)
    }

    val count = Math.min(first.size, Math.min(second.size, third.size))

    bw.write("$count")
    bw.newLine()
    for (i in 0 until count) {
        bw.write("${first[i]} ${second[i]} ${third[i]}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}