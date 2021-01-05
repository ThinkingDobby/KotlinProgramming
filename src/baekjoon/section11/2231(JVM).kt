package baekjoon.section11

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var ans = -1

    for (m in 0..1000000) {
        if (d(m) == n) {
            ans = m
            break
        }
    }
    if (ans == -1) ans = 0

    bw.write("$ans")

    bw.flush()
    bw.close()
}

fun d(m: Int): Int {
    val new = m.toString()
    var sum = 0
    for (element in new) {
        sum += element.toInt() - 48
    }

    return (sum + m)
}