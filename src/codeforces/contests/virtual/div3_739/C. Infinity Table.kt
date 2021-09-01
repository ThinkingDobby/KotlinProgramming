package codeforces.contests.virtual.div3_739

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val k = br.readLine().toLong()

        var i = 0
        var sum = 0
        var prev = 0

        while (true) {
            sum += 2 * i + 1
            if (sum >= k) break
            prev = sum
            i++
        }

        if (k > prev + i) {
            bw.write("${i + 1} ${sum - k + 1}")
        } else {
            bw.write("${k - prev} ${i + 1}")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
