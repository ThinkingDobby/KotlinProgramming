package practice.baekjoon.section14

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val arr = LongArray(101) { 0 }
        arr[1] = 1
        arr[2] = 1
        arr[3] = 1
        arr[4] = 2
        arr[5] = 2
        for (i in 6..n) {
            if (arr[i] == 0L) arr[i] = arr[i - 1] + arr[i - 5]
        }
        bw.write("${arr[n]}\n")
    }

    bw.flush()
    bw.close()
}
