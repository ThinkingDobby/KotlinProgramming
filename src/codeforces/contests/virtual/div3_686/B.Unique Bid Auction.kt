package codeforces.contests.virtual.div3_686

import java.io.*
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()

        val scoreToIndex = mutableMapOf<Int, Int>()

        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            val tmp = st.nextToken().toInt()
            if (tmp !in scoreToIndex.keys) {
                scoreToIndex[tmp] = i + 1
            } else {
                scoreToIndex[tmp] = -1
            }
        }

        try {
            val sortedMap = scoreToIndex.filterValues { it != -1 }.toSortedMap()
            bw.write("${sortedMap[sortedMap.firstKey()]}")
        } catch (e: Exception) {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}