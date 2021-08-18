package codeforces.contests.realtime.div2_737

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }

        val memo1 = mutableMapOf<Long, Int>()
        val memo2 = mutableListOf<Long>()
        val st = StringTokenizer(br.readLine())
        for (i in 1..n) {
            val temp = st.nextToken().toLong()
            memo1[temp] = i
            memo2.add(temp)
        }

        var cnt = 0
        memo2.sort()
        for (i in 1 until n) {
            if (memo1[memo2[i]]!! - memo1[memo2[i - 1]]!! == 1) cnt++
        }

        if (n - cnt > k) bw.write("No")
        else bw.write("Yes")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
