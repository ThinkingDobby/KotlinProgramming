package baekjoon.etc.silver

import java.io.*
import java.util.*

fun main() {
    val stack = Stack<Int>()

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    repeat(n) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "push" -> stack.push(input[1].toInt())
            "pop" -> bw.write("${if (stack.empty()) -1 else stack.pop()}\n")
            "size" -> bw.write("${stack.size}\n")
            "empty" -> bw.write("${if (stack.empty()) 1 else 0}\n")
            "top" -> bw.write("${if (stack.empty()) -1 else stack.peek()}\n")
        }
    }

    bw.flush()
    bw.close()
}