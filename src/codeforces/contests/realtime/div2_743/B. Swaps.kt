package codeforces.contests.realtime.div2_743
// TLE
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val a = br.readLine().split(" ").map { it.toInt() }
        val b = br.readLine().split(" ").map { it.toInt() }

        var min = Int.MAX_VALUE
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (a[i] < b[j]) {
                    min = minOf(min, i + j)
                    break
                }
            }
            if (i >= min) break
        }

        bw.write("$min")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}
