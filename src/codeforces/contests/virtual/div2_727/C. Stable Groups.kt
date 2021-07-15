package codeforces.contests.virtual.div2_727
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val k = st1.nextToken().toLong()
    val x = st1.nextToken().toLong()

    val st2 = StringTokenizer(br.readLine())
    val levels = Array(n) { st2.nextToken().toLong() }.sorted()

    val diff = LongArray(n - 1) {Math.max(0, levels[it + 1] - levels[it] - 1) / x}.sorted()

    var ans = n
    var temp = k
    for (i in diff) {
        if (i <= temp) {
            temp -= i
            ans--
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}