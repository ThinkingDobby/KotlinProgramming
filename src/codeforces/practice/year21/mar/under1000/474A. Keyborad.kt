package codeforces.practice.year21.mar.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val keyboard = arrayOf(
            arrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'),
            arrayOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';'),
            arrayOf('z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/')
    )

    val type = br.readLine()
    val input = br.readLine()

    fun search(target: Char): Char {
        for (i in 0 until 3) {
            for (j in 0 until 10) {
                if (keyboard[i][j] == target) {
                    if (type == "L") {
                        return keyboard[i][j + 1]
                    } else {
                        return keyboard[i][j - 1]
                    }
                }
            }
        }
        return '0'
    }

    for (i in input) {
        bw.write("${search(i)}")
    }

    bw.flush()
    bw.close()
}