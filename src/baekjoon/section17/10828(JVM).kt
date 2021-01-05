package baekjoon.section17

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Int>()

    val n = br.readLine().toInt()

    repeat(n) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "push" -> stack.push(input[1].toInt())
            "pop" -> {
                if (stack.isEmpty()) {
                    bw.write("-1\n")
                } else {
                    stack.pop().also { bw.write("$it\n") }
                }
            }
            "size" -> bw.write("${stack.size}\n")
            "empty" -> if (stack.isEmpty()) {
                bw.write("1\n")
            } else {
                bw.write("0\n")
            }
            "top" -> if (stack.isEmpty()) {
                bw.write("-1\n")
            } else {
                bw.write("${stack.last()}\n")
            }
        }
    }

    bw.flush()
    bw.close()
}