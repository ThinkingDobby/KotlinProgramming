package practice.baekjoon.section9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    for (z in 0 until t) {

        val n = br.readLine().toInt()
        val arr = ArrayList<Int>(n + 1)

        for (i in 2..n) {
            for (j in 2..i) {
                if (i % j == 0) {
                    if (i == j) arr.add(i) else break
                }
            }
        }

        var ansI = 0
        var ansJ = 0
        var min = n
        for (i in arr) {
            for (j in arr) {
                if (i + j == n)
                    if (min > abs(i, j)) {
                        ansI = i
                        ansJ = j
                        min = abs(i, j)
                    }
            }
        }
        bw.write("$ansI $ansJ\n")
    }

    bw.flush()
    bw.close()
}

fun abs(i: Int, j: Int): Int {
    return if (i - j < 0) j - i else i - j
}