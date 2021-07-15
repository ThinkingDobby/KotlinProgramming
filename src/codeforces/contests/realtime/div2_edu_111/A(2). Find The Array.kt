package codeforces.contests.realtime.div2_edu_111

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val s = br.readLine().toInt()

        var sum = 1
        var now = 1
        var count = 1
        while (true) {
            if (sum >= s) break
            count++
            now += 2
            sum += now
        }

        bw.write("$count")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}