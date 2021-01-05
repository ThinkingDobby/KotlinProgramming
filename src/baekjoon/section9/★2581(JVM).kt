package practice.baekjoon.section9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    var sum = 0
    var min = n

    for (i in m..n) {
        for (j in 2..i) {
            if (i % j == 0) {
                if (i == j) {
                    sum += i
                    if (min > i) min = i
                } else break
            }
        }
    }

    if (sum == 0) bw.write("-1")
    else bw.write("$sum\n$min")

    bw.flush()
    bw.close()
}