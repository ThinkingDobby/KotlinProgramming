package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val deque = LinkedList<Int>()

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "push_front" -> deque.push(input[1].toInt())
            "push_back" -> deque.add(input[1].toInt())
            "pop_front" -> bw.write("${if (deque.isEmpty()) -1 else deque.pollFirst()}\n")
            "pop_back" -> bw.write("${if (deque.isEmpty()) -1 else deque.pollLast()}\n")
            "size" -> bw.write("${deque.size}\n")
            "empty" -> bw.write("${if (deque.isEmpty()) 1 else 0}\n")
            "front" -> bw.write("${if (deque.isEmpty()) -1 else deque.first()}\n")
            "back" -> bw.write("${if (deque.isEmpty()) -1 else deque.last()}\n")
        }
    }

    bw.flush()
    bw.close()
}