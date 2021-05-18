package practice.baekjoon.section14.pac1003

import java.io.*

private var cnt0 = 0
private var cnt1 = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    for (i in 0 until t) {
        val n = br.readLine().toInt()
        cnt0 = 0
        cnt1 = 0
        fibonacci(n)
        bw.write("$cnt0 $cnt1\n")
    }

    bw.flush()
    bw.close()
}

fun fibonacci(n: Int): Int {
    if (n == 0) {
        cnt0++
        return 0
    } else if (n == 1) {
        cnt1++
        return 1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}