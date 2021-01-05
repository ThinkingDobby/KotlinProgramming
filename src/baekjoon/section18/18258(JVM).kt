package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue = LinkedList<Int>()

    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "push" -> queue.add(input[1].toInt())
            "pop" -> bw.write("${if (queue.isEmpty()) -1 else queue.pop()}\n")
            "size" -> bw.write("${queue.size}\n")
            "empty" -> bw.write("${if (queue.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${if (queue.isEmpty()) -1 else queue.first()}\n")
            "back" -> bw.write("${if (queue.isEmpty()) -1 else queue.last()}\n")
        }
    }

    bw.flush()
    bw.close()
}