package codeforces.contests.virtual.div2_726
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val mountains = Array(n) { st.nextToken().toLong() }.sorted()

        var min = Long.MAX_VALUE
        var minIdx = -1
        for (i in 1 until n) {

            val temp = Math.abs(mountains[i] - mountains[i - 1])
            if (temp < min) {
                min = temp
                minIdx = i
            }
        }

        if (mountains[minIdx] < mountains[minIdx - 1])
            bw.write("${mountains[minIdx]} ")
        else
            bw.write("${mountains[minIdx - 1]} ")

        if (n == 4) {
            for (i in n - 1 downTo 0) {
                if (i == minIdx || i == minIdx - 1) continue
                bw.write("${mountains[i]} ")
            }
        } else {
            for (i in 0 until n) {
                if (i == minIdx || i == minIdx - 1) continue
                bw.write("${mountains[i]} ")
            }
        }

        if (mountains[minIdx] > mountains[minIdx - 1])
            bw.write("${mountains[minIdx]} ")
        else
            bw.write("${mountains[minIdx - 1]} ")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}