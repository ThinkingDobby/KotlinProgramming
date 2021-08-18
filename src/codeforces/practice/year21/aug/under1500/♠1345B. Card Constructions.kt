package codeforces.practice.year21.aug.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toLong()

        var cnt = 0
        var prev = -1L
        while (true) {
            var start = 1L
            var end = n
            while (start < end) {
                val mid = (start + end) / 2

                if (2 * mid + 3 * ( mid * (mid - 1) / 2 ) > n) {
                    end = mid
                    prev = mid - 1
                } else {
                    start = mid + 1
                    prev = mid
                }

            }

            val temp = 2 * prev + 3 * ( prev * (prev - 1) / 2 )
            if (temp > n || prev < 1) break
            else n -= temp

            if (n < 0) break
            cnt++
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
