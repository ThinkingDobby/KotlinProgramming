package codeforces.contests.virtual.div3_739

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val k = br.readLine().toInt()

        var now = 0
        var count = 0
        while (true) {
            if (count == k) break
            now++
            if (now % 3 == 0 || now.toString().last() == '3') continue
            count++
        }

        bw.write("$now")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
