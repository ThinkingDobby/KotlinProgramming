package baekjoon.section22

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val heap = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n) {
        val tmp = br.readLine().toInt()
        if (tmp == 0) {
            if (heap.isEmpty()) bw.write("0")
            else bw.write("${heap.poll()}")
            bw.newLine()
        } else {
            heap.add(tmp)
        }
    }

    bw.flush()
    bw.close()
}