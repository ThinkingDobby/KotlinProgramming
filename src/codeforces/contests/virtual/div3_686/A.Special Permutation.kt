package codeforces.contests.virtual.div3_686

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val queue = LinkedList<Int>()
        for (i in 1..n) {
            queue.add(i)
        }
        val tmp = queue.first()
        queue.pop()
        queue.add(tmp)

        queue.forEach { bw.write("$it ") }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}