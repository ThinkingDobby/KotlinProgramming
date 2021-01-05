package practice.baekjoon.etc.bronze

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<String>()

    while (true) {
        val tmp = br.readLine()
        if (tmp == "0") break
        list.add(tmp)
    }

    for (i in list.indices) {
        if (list[i].take(list[i].length / 2) == list[i].takeLast(list[i].length / 2).reversed()) {
            bw.write("yes")
        } else {
            bw.write("no")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}