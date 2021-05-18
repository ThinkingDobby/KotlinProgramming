package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val ans = LinkedList<Int>()

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val queue = LinkedList<Int>()
    for (i in 1..n) {
        queue.add(i)
    }

    while (true) {
        repeat(k - 1) {
            val tmp = queue.first()
            queue.pop()
            queue.add(tmp)
        }
        ans.add(queue.first())
        queue.pop()
        if (queue.isEmpty()) break
    }

    bw.write("<${ans.joinToString(", ")}>")

    bw.flush()
    bw.close()
}