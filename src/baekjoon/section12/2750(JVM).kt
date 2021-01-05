package practice.baekjoon.section12

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { 0 }

    repeat(n) {
        arr[it] = br.readLine().toInt()
    }


    for (i in n - 1 downTo 1) {
        for (j in 0 until i) {
            if (arr[j] > arr[j + 1]) {
                val tmp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = tmp
            }
        }
    }

    repeat(n) {
        bw.write("${arr[it]}\n")
    }

    bw.flush()
    bw.close()
}