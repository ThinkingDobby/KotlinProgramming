package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = br.readLine()

        if (input == ".") break

        val stack = Stack<Int>()

        try {
            for (i in input.indices) {
                if (input[i] == '(') stack.push(0)
                if (input[i] == '[') stack.push(1)

                if (input[i] == ')') {
                    if (stack.peek() == 0) stack.pop()
                    else throw EmptyStackException()
                }
                if (input[i] == ']') {
                    if (stack.peek() == 1) stack.pop()
                    else throw EmptyStackException()
                }
            }

            if (stack.isEmpty()) bw.write("yes")
            else bw.write("no")
        } catch (e: EmptyStackException) {
            bw.write("no")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}