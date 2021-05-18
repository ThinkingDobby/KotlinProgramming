package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val queue = LinkedList<Int>()
    for (i in 0 until n) {
        queue.add(i + 1)
    }

    while (true) {
        if (queue.size == 1) break
        queue.pop()
        val tmp = queue.first()
        queue.pop()
        queue.add(tmp)
    }
    bw.write("${queue.first}")

    bw.flush()
    bw.close()
}