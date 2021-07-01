package codeforces.practice.year21.jun.under1500
// WA
import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        var count = 0
        if (a > b) {
            val temp = a / 2
            if (b >= temp) {
                count += temp
            } else {
                count += b
            }
        } else {
            val temp = b / 2
            if (a >= temp) {
                count += temp
            } else {
                count += a
            }
        }

        val tempA = a / 3
        val tempB = b / 3
        var tempCount = 0
        if (a % 3 + b % 3 > 2) tempCount++
        if (tempA > tempB) {
            count = Math.max(count, tempB * 2 + tempCount)
        } else {
            count = Math.max(count, tempA * 2 + tempCount)
        }

        bw.write("$count")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}