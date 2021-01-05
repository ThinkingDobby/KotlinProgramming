package practice.baekjoon.section4

import java.io.*
// 더하기 사이클
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = Integer.parseInt(br.readLine())
    val tmp: Int = n

    var cnt = 0
    while (true) {
        val a = n / 10
        val b = n % 10
        val c = (a + b) % 10
        n = b * 10 + c
        cnt++
        if (n == tmp) break
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}