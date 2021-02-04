package atcoder.contests.realtime.beginner_189

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val x = st1.nextToken().toInt() * 100

    var sum = 0
    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        val total = st2.nextToken().toInt()
        val per = st2.nextToken().toInt()
        sum += total * per
        if (sum > x) {
            bw.write("${i + 1}")
            break
        }
        if (i == n - 1) bw.write("-1")
    }

    bw.flush()
    bw.close()
}