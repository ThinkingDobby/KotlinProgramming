package baekjoon.etc.silver

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val tmp = br.readLine().toInt()
        if (tmp != 0) {
            stack.push(tmp)
        } else {
            stack.pop()
        }
    }

    bw.write("${stack.sum()}")

    bw.flush()
    bw.close()
}