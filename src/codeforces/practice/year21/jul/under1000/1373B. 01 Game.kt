package codeforces.practice.year21.jul.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val input = br.readLine()
        val stack = Stack<Char>()
        var count = 0

        for (i in input.indices) {
            if (stack.isEmpty()) stack.push(input[i])
            else {
                if (stack.peek() != input[i]) {
                    count++
                    stack.pop()
                } else {
                    stack.push(input[i])
                }
            }
        }

        if (count % 2 == 0) {
            bw.write("NET")
        } else {
            bw.write("DA")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}