package practice.baekjoon.etc.silver
// 큐를 이용한 방식
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val queue = LinkedList<Int>()

    for (i in 1..n) {
        queue.add(i)
    }

    for (i in 0 until n) {
        if (queue.size == 1) {
            bw.write("${queue.poll()}")
            break
        }
        queue.poll()
        queue.add(queue.poll())
    }

    bw.flush()
    bw.close()
}