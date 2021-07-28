package codeforces.contests.realtime.div3_734

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toLong()

        val temp = n / 3
        val rest = n % 3
        if (rest == 0L) bw.write("$temp $temp")
        else if (rest == 1L) bw.write("${temp + 1} $temp")
        else bw.write("$temp ${temp + 1}")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
