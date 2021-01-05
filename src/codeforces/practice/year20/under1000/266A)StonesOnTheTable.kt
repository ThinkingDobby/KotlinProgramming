package codeforces.practice.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()

    val isUsedRGB = Array(3) { false }

    var count = 0
    for (i in 0 until n) {
        when (input[i]) {
            'R' -> {
                if (isUsedRGB[0]) {
                    count++
                } else {
                    isUsedRGB[0] = true
                    isUsedRGB[1] = false
                    isUsedRGB[2] = false
                }
            }
            'G' -> {
                if (isUsedRGB[1]) {
                    count++
                } else {
                    isUsedRGB[0] = false
                    isUsedRGB[1] = true
                    isUsedRGB[2] = false
                }
            }
            'B' -> {
                if (isUsedRGB[2]) {
                    count++
                } else {
                    isUsedRGB[0] = false
                    isUsedRGB[1] = false
                    isUsedRGB[2] = true
                }
            }
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}