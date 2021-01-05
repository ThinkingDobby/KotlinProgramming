package practice.baekjoon.section10

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    bw.write("${factorial(n)}")

    bw.flush()
    bw.close()
}

fun factorial(n: Int, a: Int = 1): Int {
    return if (n == 0) a else factorial(n - 1, a * n)
}