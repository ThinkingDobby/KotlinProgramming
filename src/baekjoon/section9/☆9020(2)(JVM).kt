package practice.baekjoon.section9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val arr = Array(5082) { true }
    arr[0] = false
    arr[1] = false

    for (i in 2..5081)
        for (j in 2..5081)
            if (i * j <= 5081) arr[i * j] = false else break

    for (i in 0 until t) {
        val n = br.readLine().toInt()
        var first = n / 2
        var second = n / 2

        while (true) {
            if (arr[first] && arr[second]) {
                break
            }
            first--
            second++
        }
        bw.write("$first $second\n")
    }

    bw.flush()
    bw.close()
}