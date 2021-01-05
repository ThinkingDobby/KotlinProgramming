package codeforces.contests.realtime.div2_691

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val reds = br.readLine()
        val blues = br.readLine()

        var redCount = 0
        var blueCount = 0
        for (i in 0 until n) {
            if (reds[i].toInt() > blues[i].toInt()) redCount++
            else if (reds[i].toInt() < blues[i].toInt()) blueCount++
        }

        if (redCount > blueCount) bw.write("RED")
        else if (redCount < blueCount) bw.write("BLUE")
        else bw.write("EQUAL")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}