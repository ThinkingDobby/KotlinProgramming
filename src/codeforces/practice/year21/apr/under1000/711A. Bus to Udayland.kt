package codeforces.practice.year21.apr.under1000

import java.io.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val seats = Array(n) { br.readLine() }

    var ans = false

    for (i in 0 until n) {
        if (seats[i][0] == 'O' && seats[i][1] == 'O' && !ans) {
            ans = true
            bw.write("++|")
        } else {
            for (j in 0 until 3) {
                bw.write("${seats[i][j]}")
            }
        }

        if (seats[i][3] == 'O' && seats[i][4] == 'O' && !ans) {
            ans = true
            bw.write("++")
        } else {
            for (j in 3 until 5) {
                bw.write("${seats[i][j]}")
            }
        }

        bw.newLine()
    }

    if (ans) {
        println("YES")
    } else {
        println("NO")
        exitProcess(0)
    }

    bw.flush()
    bw.close()
}