package practice.baekjoon.section14

import  java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var min = Int.MAX_VALUE
    fun func(now: Int, count: Int = 0) {
        if (now == 1) {
            if (count < min) {
                min = count
            }
            return
        }
        if (now % 3 == 0) {
            func(now / 3, count + 1)
        }
        if (now % 2 == 0) {
            func(now / 2, count + 1)
        }
        func(now - 1, count + 1)
    }

    func(n)
    bw.write("$min")

    bw.flush()
    bw.close()
}