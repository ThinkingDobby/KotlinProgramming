package practice.baekjoon.section5

import java.io.*

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))

    val arr = Array<Boolean>(42){false}

    for (i in 0..9) {
        val num = br.readLine().toInt()
        arr[num % 42] = true
    }

    var cnt = 0
    for (j in 0..41) if (arr[j]) cnt++

    bw.write("$cnt")
    bw.flush()
    bw.close()
}