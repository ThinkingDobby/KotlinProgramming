package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val input = br.readLine()

    val stack = Stack<Char>()

    var count = 0
    for (i in 0 until n) {
        if (stack.isEmpty()) {
            stack.add(input[i])
        } else {
            if (input[i] == stack.peek()) {
                stack.add(input[i])
            } else {
                count++
                stack.pop()
            }
        }
    }

    bw.write("${n - count * 2}")

    bw.flush()
    bw.close()
}