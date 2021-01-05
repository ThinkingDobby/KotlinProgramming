package practice.baekjoon.section5

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = ArrayList<Int>(9)

    repeat(9) {
        val tmp = br.readLine().toInt()
        list.add(tmp)
    }

    val max = list.max()
    var cnt = 0

    for (i in 0..8) {
        if (list[i] == max) break
        cnt++
    }

    bw.write("$max\n")
    bw.write("${cnt+1}")
    bw.flush()
    bw.close()
}