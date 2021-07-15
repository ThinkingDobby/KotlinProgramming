package codeforces.contests.realtime.div3_731
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine()
        val st1 = StringTokenizer(br.readLine())
        val k = st1.nextToken().toInt()
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val first = ArrayDeque(br.readLine().split(" ").map { it.toInt() })
        val second = ArrayDeque(br.readLine().split(" ").map { it.toInt() })

        val ans = mutableListOf<Int>()
        var count = k


        while (first.isNotEmpty() || second.isNotEmpty()) {
            if (first.isNotEmpty() && (first.first == 0 || first.first <= count)) {
                if (first.first == 0) count++
                ans.add(first.removeFirst())
            } else if (second.isNotEmpty() && (second.first == 0 || second.first <= count)) {
                if (second.first == 0) count++
                ans.add(second.removeFirst())
            } else break
        }
        if (ans.size == n + m) {
            bw.write("${ans.joinToString(" ")}")
        } else {
            bw.write("-1")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}