package codeforces.contests.realtime.div2_edu_111

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val s = br.readLine().toInt()

        var sum = 0
        var count = 0
        for (i in 1..2 * s step 2) {
            sum += i
            count++
            if (sum >= s) {
                break
            }
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}