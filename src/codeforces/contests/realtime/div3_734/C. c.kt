package codeforces.contests.realtime.div3_734
// 미완성
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, k) = br.readLine().split(" ").map { it.toInt() }
        val input = br.readLine().split(" ").map { it.toInt() }

        val memo = mutableMapOf<Int, Int>()
        for (i in 0 until n) {
            val now = input[i]
            if (now !in memo) memo[now] = 1
            else memo[now] = memo[now]!! + 1
        }

        var cnt = 0
        var sum = 0
        for (i in memo.values) {
            if (i > k) cnt++
            else sum += i
        }
        val len = sum / k + cnt

        val rest = mutableMapOf<Int, Int>()
        for (i in memo.keys) {
            rest[i] = 1
        }
        for (i in 0 until n) {
            val now = input[i]
            if (now !in memo.keys) bw.write("0 ")
            else {
                bw.write("${rest[i]} ")
                rest[i] = rest[i]!! + 1

                if (rest[now]!! > now || rest[now]!! == k) memo.remove(now)
            }
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}





