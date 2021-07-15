package codeforces.contests.realtime.div3_731
// 미완성
import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    for (i in 0 until t) {
        br.readLine()
        val st1 = StringTokenizer(br.readLine())
        val k = st1.nextToken().toInt()
        val n = st1.nextToken().toInt()
        val m = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val first = Array(n) { st2.nextToken().toInt() }

        val st3 = StringTokenizer(br.readLine())
        val second = Array(m) { st3.nextToken().toInt() }

        var count = k
        var firstIdx = 0
        var secondIdx = 0

        var ans = ""

        a@ while (true) {
            if (firstIdx < n) {
                if (first[firstIdx] == 0) {
                    count++
                    firstIdx++
                } else {
                    count--
                    if (count < 0) {
                        bw.write("-1")
                        bw.newLine()
                        break@a
                    }
                    ans += "${first[firstIdx]} "
                }
            }
            if (secondIdx < m) {
                if (second[secondIdx] == 0) {
                    count++
                    secondIdx++
                } else {
                    count--
                    if (count < 0) {
                        bw.write("-1")
                        bw.newLine()
                        break@a
                    }
                    ans += "${second[secondIdx]} "
                }
            }
            if (firstIdx >= n && secondIdx >= m) break
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}