package baekjoon.section22

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val heap = PriorityQueue<Int> { o1, o2 ->
        if (Math.abs(o1) == Math.abs(o2)) {
            Integer.compare(o1, o2)
        } else {
            Integer.compare(Math.abs(o1), Math.abs(o2))
        }
    }

    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().toInt()
        if (input == 0) {
            if (heap.isEmpty()) bw.write("0")
            else {
                bw.write("${heap.poll()}")
            }
            bw.newLine()
        } else {
            heap.add(input)
        }
    }

    bw.flush()
    bw.close()
}