package codeforces.practice.year21.aug.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        val memo1 = Array(n){0L}
        val memo2 = Array(n){0L}

        val st = StringTokenizer(br.readLine())
        for (i in 0 until n) {
            val temp = st.nextToken().toInt() - (i + 1)
            if (temp < 0) memo1[Math.abs(temp)]++
            else memo2[temp]++
        }


        var cnt = 0L
        for (i in 0 until n) {
            if (memo1[i] != 0L) cnt += (memo1[i] * (memo1[i] - 1)) / 2
            if (memo2[i] != 0L) cnt += (memo2[i] * (memo2[i] - 1)) / 2
        }

        bw.write("$cnt")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}