package practice.baekjoon.section12

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val arr = CharArray(n.length)
    repeat(n.length) {
        arr[it] = n[it]
    }
    arr.sort()

    for (i in n.length - 1 downTo 0) {
        bw.write("${arr[i]}")
    }

    bw.flush()
    bw.close()
}