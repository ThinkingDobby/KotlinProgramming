package practice.baekjoon.section12

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val arr = Array(n) { br.readLine().toInt() }
    val count = Array(arr.max()!! + 1) { 0 }

    for (i in 0 until n)
        count[arr[i]]++

    for (i in count.indices)
        if (count[i] != 0)
            for (j in 0 until count[i]) bw.write("$i\n")

    bw.flush()
    bw.close()
}