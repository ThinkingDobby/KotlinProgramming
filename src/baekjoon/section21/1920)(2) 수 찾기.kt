package baekjoon.section21
// practice
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    val inputs = Array(n) { st1.nextToken().toInt() }.sorted()

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    repeat(m) {
        val tmp = st2.nextToken().toInt()

        var ans = false
        var left = 0
        var right = n - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (tmp < inputs[mid]) right = mid - 1
            else if (tmp > inputs[mid]) left = mid + 1
            else {
                ans = true
                break
            }
        }

        if (ans) bw.write("1")
        else bw.write("0")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}