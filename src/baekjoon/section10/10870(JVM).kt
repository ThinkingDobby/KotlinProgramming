package practice.baekjoon.section10

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val a = 0
    val b = 1

    bw.write("${fibo(n, a, b)}")

    bw.flush()
    bw.close()
}

fun fibo(n: Int, a: Int, b: Int): Int {
    return if (n == 0) a else fibo(n - 1, b, a + b)
}