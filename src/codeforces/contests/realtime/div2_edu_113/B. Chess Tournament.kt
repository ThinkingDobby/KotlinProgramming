package codeforces.contests.realtime.div2_edu_113

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val input = br.readLine()

        val memo = Array(n) { CharArray(n) { '=' } }
        val twos = mutableListOf<Int>()

        for (i in 0 until n) {
            memo[i][i] = 'X'
            if (input[i] == '2') twos.add(i)
        }

        if (twos.size in 1..2) {
            bw.write("NO")
            bw.newLine()
        } else {
            bw.write("YES")
            bw.newLine()
            for (i in twos.indices) {
                if (i == twos.size - 1) {
                    memo[twos[i]][twos.first()] = '+'
                    memo[twos.first()][twos[i]] = '-'
                } else {
                    memo[twos[i]][twos[i + 1]] = '+'
                    memo[twos[i + 1]][twos[i]] = '-'
                }
            }

            for (i in 0 until n) {
                for (j in 0 until n) {
                    bw.write("${memo[i][j]}")
                }
                bw.newLine()
            }
        }
    }

    bw.flush()
    bw.close()
}
