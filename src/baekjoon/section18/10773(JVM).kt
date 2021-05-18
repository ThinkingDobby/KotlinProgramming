package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Int>()

    val k = br.readLine().toInt()

    repeat(k) {
        val input = br.readLine().toInt()
        if (input == 0) stack.pop()
        else stack.push(input)
    }

    bw.write("${stack.sum()}")

    bw.flush()
    bw.close()
}