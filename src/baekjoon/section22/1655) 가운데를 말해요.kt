package baekjoon.section22
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val minPQ = PriorityQueue<Int>()
    val maxPQ = PriorityQueue<Int>(Comparator.reverseOrder())

    val n = br.readLine().toInt()
    repeat(n) {
        val input = br.readLine().toInt()
        if (maxPQ.size > minPQ.size) {
            minPQ.add(input)
        } else {
            maxPQ.add(input)
        }

        if (maxPQ.isNotEmpty() && minPQ.isNotEmpty()) {
            if (maxPQ.peek() > minPQ.peek()) {
                val tmp1 = maxPQ.poll()
                val tmp2 = minPQ.poll()
                maxPQ.add(tmp2)
                minPQ.add(tmp1)
            }
        }

        bw.write("${maxPQ.peek()}")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

/* testcase
6
10
8
5
3
5
-1
 */