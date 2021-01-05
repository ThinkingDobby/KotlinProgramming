package baekjoon.section18

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val testCase = br.readLine().toInt()
    repeat(testCase) {
        val st1 = StringTokenizer(br.readLine())
        val number = st1.nextToken().toInt()
        val target = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val queue = LinkedList<Pair<Int, Int>>()
        for (i in 0 until number) {
            queue.add(i to st2.nextToken().toInt())
        }

        var count = 0
        while (true) {
            var over = false
            for (i in 1 until queue.size) {
                if (queue[0].second < queue[i].second) {
                    over = true
                }
            }
            if (over) {
                val tmp = queue[0]
                queue.pop()
                queue.add(tmp)
            } else {
                count++
                if (queue[0].first == target) {
                    bw.write("$count")
                    break
                }
                queue.pop()
            }
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}