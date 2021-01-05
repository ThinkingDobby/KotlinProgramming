package baekjoon.section17
// practice
import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    val stack = Stack<Int>()
    val sb = StringBuilder()

    var start = 0

    repeat(n) {
        val input = br.readLine().toInt()

        if (input > start) {
            for (i in start + 1..input) {
                stack.push(i)
                sb.append("+").append("\n")
            }
            start = input
        } else if (input != stack.peek()) {
            println("NO")
            return
        }

        stack.pop()
        sb.append("-").append("\n")
    }

    println(sb)
}