package codeforces.contests.realtime.div2_738

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map { it.toInt() }

        if (inputs.last() == 0) {
            for (i in 1..n + 1) bw.write("$i ")
        } else {
            if (inputs[0] != 0) {
                bw.write("${n + 1} ")
                for (i in 1..n) bw.write("$i ")
            } else {
                var ans = false
                for (i in 0 until n - 1) {
                    if (inputs[i] == 0 && inputs[i + 1] != 0) {
                        for (j in 1..i + 1) bw.write("$j ")
                        bw.write("${n + 1} ")
                        for (j in i + 2..n) bw.write("$j ")
                        ans = true
                        break
                    }
                }

                if (!ans) bw.write("-1")
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}