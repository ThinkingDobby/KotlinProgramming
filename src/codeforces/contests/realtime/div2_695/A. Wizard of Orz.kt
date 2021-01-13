package codeforces.contests.realtime.div2_695

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().toInt()

        if (input < 2) {
            bw.write("9")
        } else if (input < 3) {
            bw.write("98")
        } else {
            bw.write("989")
            var count = 0
            for (i in 0 until input - 3) {
                bw.write("$count")
                count++
                if (count == 10) count = 0
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}