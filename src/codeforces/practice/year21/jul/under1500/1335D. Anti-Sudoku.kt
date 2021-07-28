package codeforces.practice.year21.jul.under1500

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val input = Array(9) { br.readLine().toCharArray() }
        input[0][1] = input[0][0]
        input[1][3] = input[1][0]
        input[2][6] = input[2][0]
        input[3][2] = input[3][0]
        input[4][4] = input[4][0]
        input[5][7] = input[5][0]
        input[6][5] = input[6][0]
        input[7][8] = input[7][0]
        input[8][0] = input[6][0]

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                bw.write("${input[i][j]}")
            }
            bw.newLine()
        }
    }
    bw.flush()
    bw.close()
}