package baekjoon.section17
// 참조한 코드
import java.io.*
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val sb = StringBuilder()

    val stack = Stack<Int>()

    var n = br.readLine().toInt()

    var start = 0

    while (n --> 0) {
        val value = br.readLine().toInt()

        if (value > start) {
            for (i in start + 1..value) {
                stack.push(i)
                sb.append("+").append("\n")
            }
            start = value
        } else if (stack.peek() != value) {
            println("NO")
            return
        }

        stack.pop()
        sb.append("-").append("\n")
    }
    println(sb)
}