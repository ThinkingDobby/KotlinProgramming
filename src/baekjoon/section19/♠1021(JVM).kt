package baekjoon.section19

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val target = Array(m) { st2.nextToken().toInt() }

    val deque = LinkedList<Int>()
    for (i in 1..n) {
        deque.add(i)
    }

    var i = 0
    var count = 0
    while (i < m) {
        if (deque.indexOf(target[i]) >= (deque.size + 1) / 2) {
            while (true) {
                if (target[i] == deque[0]) {
                    deque.poll()
                    break
                }
                val tmp = deque.last()
                deque.pollLast()
                deque.push(tmp)
                count++
            }
        } else {
            while (true) {
                if (target[i] == deque[0]) {
                    deque.poll()
                    break
                }
                val tmp = deque.first()
                deque.poll()
                deque.add(tmp)
                count++
            }
        }
        i++
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}