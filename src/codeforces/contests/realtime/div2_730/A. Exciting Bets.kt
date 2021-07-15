package codeforces.contests.realtime.div2_730

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toLong()
        val b = st.nextToken().toLong()

        var min = Math.min(a, b)

        val temp = Math.abs(a - b)

        if (temp == 0L) min = 0L
        else {
            val tempA = (a - 1) / temp + 1
            val tempB = (b - 1) / temp + 1
            if (temp * tempA - a == temp * tempB - b) {
                min = Math.min(min, temp * tempA - a)
            }

            val tempA2 = tempA - 1
            val tempB2 = tempB - 1
            if (temp * tempA2 - a == temp * tempB2 - b) {
                min = Math.min(min, Math.abs(temp * tempA2 - a))
            }

        }

        bw.write("$temp $min")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}