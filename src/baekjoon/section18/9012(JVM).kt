package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val stack = Stack<Int>()

        val inputs = br.readLine()
        var special = false

        for (i in inputs.indices) {
            if (inputs[i] == '(') stack.push(0)
            if (inputs[i] == ')') {
                if (stack.isEmpty()) {
                    special = true
                    break
                }
                stack.pop()
            }
        }

        if (stack.isEmpty() && !special) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}