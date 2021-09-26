package codeforces.contests.realtime.div2_edu_114

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val heroes = br.readLine().split(" ").map { it.toLong() }.sorted()
    val sum = heroes.sum()
    val m = br.readLine().toInt()
    repeat(m) {
        var tmp = 0L
        val (x, y) = br.readLine().split(" ").map { it.toLong() }

        var start = 0
        var end = n - 1

        while (start < end) {
            val mid = (start + end) / 2
            if (heroes[mid] <= x) {
                start = mid + 1
            } else {
                end = mid
            }
        }
        var target = start

        tmp = maxOf(0, x - heroes[target]) + maxOf(0, y - (sum - heroes[target]))

        if (target > 0) {
            val second = target - 1
            tmp = minOf(tmp, maxOf(0L, x - heroes[second]) + maxOf(0, y - (sum - heroes[second])))
        }

        bw.write("$tmp")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
