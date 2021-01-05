package practice.baekjoon.section9

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) break

        val arr = Array(2 * n + 1){0}
        arr[1] = 1

        for (i in 2..2 * n)
            for (j in 2..2 * n)
                if (i * j <= 2 * n) arr[i * j] = 1 else break

        var cnt = 0
        for (i in n + 1..2 * n) if (arr[i] != 1) cnt++
        bw.write("$cnt\n")
    }

    bw.flush()
    bw.close()
}