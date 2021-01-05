package codeforces.contests.realtime.div2_edu_101


import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val stack = LinkedList<Int>()
        val input = br.readLine()

        var ans = true
        var error = false
        if (input.first() == ')' || input.length % 2 == 1 || input.last() == '(') {
            ans = false
        } else {
            for (i in input) {
                if (i == '(') stack.push(0)
                if (i == '?') stack.push(1)
                if (i == ')') {
                    if (stack.isEmpty()) {
                        error = true
                        break
                    }
                    stack.pop()
                }
            }

            if (stack.isEmpty() || stack.count { it == 0 } == stack.count { it == 1 }) {
                ans = true
            }
        }

        if (ans && !error) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}