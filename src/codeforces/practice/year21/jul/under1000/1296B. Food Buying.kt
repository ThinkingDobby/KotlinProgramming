package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val s = br.readLine().toLong()

        var total = s
        var count = 0L
        while (true) {
            val rest = total % 10
            val back = total / 10
            count += total - rest
            total = back + rest
            if (back == 0L) {
                count += rest
                break
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
