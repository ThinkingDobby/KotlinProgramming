package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()
    val arr = Array(26) { -1 }

    for (j in 97..122){
        for (i in 0 until input.length) {
            if (input[i].toInt() == j) {
                arr[j - 97] = i
                break   // 동일한 문자가 두 번 나오는 경우에 대비해 첫 번째 계산 후 break
            }
        }
    }

    for (k in arr) bw.write("$k ")

    bw.flush()
    bw.close()
}