package codeforces.contests.realtime.div2_edu_101
// Wrong Answer
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

        var min = h[0] + 1
        var max = min + k - 1
        for (i in 1 until n) {
            val prevMin = min
            val prevMax = max
            if (h[i] - h[i - 1] >= 2 * k) {
                ans = false
                break
            }
            max = prevMax + k - 1
            if (prevMin - (k - 1) <= h[i]) {
                min = h[i] + 1
            } else {
                min = prevMin - (k - 1)
            }
            if (prevMax < min) {
                ans = false
                break
            }
            if (min > h[i] + k) {
                ans = false
                break
            }
        }

        if (min > h.last() + 1) ans = false

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}