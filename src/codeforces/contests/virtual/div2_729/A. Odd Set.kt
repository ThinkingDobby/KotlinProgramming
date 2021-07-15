package codeforces.contests.virtual.div2_729

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        var oddCount = 0
        var evenCount = 0
        for (i in 0 until 2 * n) {
            val temp = st.nextToken().toInt()
            if (temp % 2 == 0) evenCount++
            else oddCount++
        }

        if (evenCount == oddCount) {
            bw.write("Yes")
        } else {
            bw.write("No")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}