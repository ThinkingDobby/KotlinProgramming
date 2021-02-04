package atcoder.practice.abc_c

import java.io.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val n = input.toLong()
    val tmp = (n - n / 3 * 3).toInt()

    val counts = Array(10){0}
    for (i in input) {
        counts[i.toInt() - 48]++
    }

    var ans = 0

    if (tmp == 0) {
        println(0)
        exitProcess(0)
    } else {
        if (tmp == 1) {
            if (counts[1] != 0 || counts[4] != 0 || counts[7] != 0) {
                ans = 1
            } else if (counts[2] >= 2 || (counts[2] != 0 && counts[5] != 0)) {
                ans = 2
            } else {
                ans = -1
            }
        } else if (tmp == 2) {
            if (counts[2] != 0 || counts[5] != 0 || counts[8] != 0) {
                ans = 1
            } else if (counts[1] >= 2 || (counts[1] != 0 && counts[4] != 0) || counts[4] >= 2 || (counts[1] != 0 && counts[7] != 0)) {
                ans = 2
            } else {
                ans = -1
            }
        }
    }

    if (ans >= input.length) {
        bw.write("-1")
    } else {
        bw.write("$ans")
    }

    bw.flush()
    bw.close()
}