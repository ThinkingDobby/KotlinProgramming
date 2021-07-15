package codeforces.contests.virtual.div3_725
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
        val l = st1.nextToken().toInt()
        val r = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        val inputs = Array(n) { st2.nextToken().toLong() }.sorted()

        var li = n - 1
        var ri = n - 1

        if (n == 1) {
            bw.write("0")
        } else {
            var total = 0L
            for (i in 0 until n) {
                while (li >= 0 && inputs[i] + inputs[li] >= l) li--
                while (ri >= 0 && inputs[i] + inputs[ri] > r) ri--
                total += maxOf(0, ri - maxOf(li, i)) * 1L
            }
            bw.write("$total")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}