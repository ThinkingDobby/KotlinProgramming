package codeforces.contests.realtime.div2_742

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()
        for (i in input) {
            if (i == 'U') bw.write("D")
            else if (i == 'D') bw.write("U")
            else bw.write("$i")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
