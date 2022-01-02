package codeforces.contests.realtime.div2_746
// WA
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, x) = br.readLine().split(" ").map { it.toInt() }
        val inputs = br.readLine().split(" ").map { it.toLong() }
                .withIndex().sortedBy {it.value}
        var ans = true
        var max = Int.MIN_VALUE
        for (i in n - 1 downTo 0) {
            val tmpIdx = inputs[i].index
            if (tmpIdx != i) {
                if (minOf(maxOf(i, n - 1 - i), maxOf(tmpIdx, n - 1 - tmpIdx)) < x) {
                    ans = false
                    break
                }
            }
        }

        if (ans) bw.write("YES")
        else bw.write("NO")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}