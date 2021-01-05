package practice.baekjoon.section5

import java.io.*

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    var mul = a * b * c
    val arr = IntArray(10){0}

    while (mul != 0) {
        arr[mul % 10] += 1
        mul /= 10
    }

    for (i in 0..9) {
        bw.write("${arr[i]}\n")
    }

    bw.flush()
    bw.close()
}