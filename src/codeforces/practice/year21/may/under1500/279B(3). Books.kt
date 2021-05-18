package codeforces.practice.year21.may.under1500
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val t = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val times = Array(n) { st2.nextToken().toInt() }

    var start = 0
    var end = 0
    var sum = 0
    var ans = 0

    while (start <= end) {
        if (end < n) sum += times[end++]
        if (sum <= t) ans = Math.max(ans, end - start)
        if (end == n) break
        while (sum > t) {
            sum -= times[start++]
            if (start > end) break
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}