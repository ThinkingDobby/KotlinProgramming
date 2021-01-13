package baekjoon.section17
// practice
import java.io.*
import java.lang.Exception
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val stack = Stack<Pair<Int, Int>>()
    val ans = Array(n) { 0 }

    val st = StringTokenizer(br.readLine())
    stack.push(st.nextToken().toInt() to 0)

    for (i in 1 until n) {
        val tmp = st.nextToken().toInt()
        try {
            while (tmp > stack.peek().first) {
                if (ans[stack.peek().second] == 0) ans[stack.peek().second] = tmp
                stack.pop()
            }
        } catch (e: Exception) {
        }
        stack.push(tmp to i)
    }

    ans[n - 1] = -1
    ans.forEach { if (it == 0) bw.write("-1 ") else bw.write("$it ") }

    bw.flush()
    bw.close()
}