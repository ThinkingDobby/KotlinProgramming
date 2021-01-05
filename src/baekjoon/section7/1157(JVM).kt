package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toUpperCase()

    val arr = Array(26) { 0 }

    for (i in 0..25) {
        for (j in 0 until input.length)
            if (i == input[j].toInt() - 65) arr[i] += 1
    }

    var max = 0
    var ans = 0
    for (i in 0..25) {
        if (arr[i] > max) {
            max = arr[i]
            ans = i + 65
        } else if (arr[i] == max && max == arr.max()) {
            ans = 63
            break
        }
    }

    bw.write("${ans.toChar()}")
    bw.flush()
    bw.close()
}