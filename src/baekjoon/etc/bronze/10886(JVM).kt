package practice.baekjoon.etc.bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { 0 }

    repeat(n) {
        arr[it] = br.readLine().toInt()
    }

    var cnt = 0
    for (i in arr) {
        if (i == 0) cnt++
    }

    if (cnt > n / 2) bw.write("Junhee is not cute!")
    else bw.write("Junhee is cute!")

    bw.flush()
    bw.close()
}
