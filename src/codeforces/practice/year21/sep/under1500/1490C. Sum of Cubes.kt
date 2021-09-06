package codeforces.practice.year21.sep.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val memo = Array(10000) { (it + 1).toLong() * (it + 1) * (it + 1) }

    repeat(br.readLine().toInt()) {
        val x = br.readLine().toLong()
        var ans = false
        a@for (i in memo.indices) {
            val tmp = x - memo[i]
            var start = i
            var end = memo.size - 1
            while (start <= end) {
                val mid = (start + end) / 2
                if (tmp < memo[mid]) end = mid - 1
                else if (tmp > memo[mid]) start = mid + 1
                else {
                    ans = true
                    break@a
                }
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}