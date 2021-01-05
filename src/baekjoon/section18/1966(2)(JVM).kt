package baekjoon.section18
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val queue = LinkedList<Pair<Int, Int>>()

        val st2 = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            queue.add(i to st2.nextToken().toInt())
        }

        var count = 0
        while (true) {
            var overValueExisting = false
            for (i in 1 until queue.size) {
                if (queue[0].second < queue[i].second) {
                    overValueExisting = true
                }
            }
            if (overValueExisting) {
                val tmp = queue[0]
                queue.pop()
                queue.add(tmp)
            } else {
                count++
                if (queue[0].first == m) {
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