package codeforces.contests.virtual.div3_748

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        val zeroL = input.lastIndexOf("0")
        val fiveL = input.lastIndexOf("5")

        var zeroS = -1
        var fiveS = -1
        if (zeroL != -1) {
            for (i in zeroL - 1 downTo 0) {
                if (input[i] == '0' || input[i] == '5') {
                    zeroS = i
                    break
                }
            }
        }
        if (fiveL != -1) {
            for (i in fiveL - 1 downTo 0) {
                if (input[i] == '2' || input[i] == '7') {
                    fiveS = i
                    break
                }
            }
        }

        val f = input.length - zeroS - 2
        val s = input.length - fiveS - 2
        bw.write("${minOf(f, s)}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}