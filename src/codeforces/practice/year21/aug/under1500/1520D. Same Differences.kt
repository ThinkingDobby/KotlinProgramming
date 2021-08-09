package codeforces.practice.year21.aug.under1500
// TLE
import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val inputs = br.readLine().split(" ").map{it.toInt()}

        var cnt = 0
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (j - i == inputs[j] - inputs[i]) cnt++
            }
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}