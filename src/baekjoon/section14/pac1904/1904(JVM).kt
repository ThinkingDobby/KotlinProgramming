package practice.baekjoon.section14.pac1904

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = LongArray(n + 1) { 0 }

    for (i in 1..n) {
        if (i <= 2) arr[i] = i.toLong()
        else arr[i] = (arr[i - 2] + arr[i - 1]) % 15746
    }

    bw.write("${arr[n]}")

    bw.flush()
    bw.close()
}
