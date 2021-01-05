package codeforces.contests.realtime.div2_edu_101
// 참조한 코드
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val k = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val h = Array(n) { st2.nextToken().toInt() }

        var ans = true

        var min = h[0]
        var max = h[0]
        for (i in 1 until n) {
            var minNext = h[i]
            var maxNext = h[i] + k - 1

            minNext = Math.max(min - (k - 1), minNext)
            maxNext = Math.min(max + k - 1, maxNext)

            if (minNext > maxNext) {
                ans = false
                break
            }

            min = minNext
            max = maxNext
        }

        if (min > h[n - 1] || max < h[n - 1]) ans = false

        if (ans) bw.write("YES")
        else bw.write("NO")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}