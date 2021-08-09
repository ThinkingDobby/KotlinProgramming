package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, x) = br.readLine().split(" ").map { it.toInt() }
        val inputs = br.readLine().split(" ").map { it.toLong() }.sortedDescending()

        var upper = n
        var lower = 0

        while (upper > lower) {
            val mid = (upper + lower + 1) / 2
            var total = 0L
            for (i in 0 until mid) {
                total += inputs[i]
            }
            if (total >= x * mid.toLong()) {
                lower = mid
            } else {
                upper = mid - 1
            }
        }

        bw.write("$upper")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}