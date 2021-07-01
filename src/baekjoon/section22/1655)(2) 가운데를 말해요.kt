package baekjoon.section22

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val max = PriorityQueue<Int>(Comparator.reverseOrder())
    val min = PriorityQueue<Int>()

    for (i in 0 until n) {
        val input = br.readLine().toInt()
        if (max.size == min.size) {
            max.add(input)
        } else {
            min.add(input)
        }

        if (max.isNotEmpty() && min.isNotEmpty()) {
            if (max.peek() > min.peek()) {
                val tmp = max.poll()
                max.add(min.poll())
                min.add(tmp)
            }
        }

        bw.write("${max.peek()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
