package baekjoon.section17

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Pair<Int, Int>>()

    val n = br.readLine().toInt()
    val ans = Array(n) { 0 }

    val st = StringTokenizer(br.readLine())
    stack.push(st.nextToken().toInt() to 0)
    for (i in 1 until n) {
        val input = st.nextToken().toInt()
        try {
            while (input > stack.peek().first) {
                if (ans[stack.peek().second] == 0) ans[stack.peek().second] = input
                stack.pop()
            }
        } catch (e: EmptyStackException) {
        }
        stack.push(input to i)
    }

    ans[n - 1] = -1
    ans.forEach {
        if (it == 0) {
            bw.write("-1 ")
        } else bw.write("$it ")
    }

    bw.flush()
    bw.close()
}