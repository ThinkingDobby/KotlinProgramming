package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())

        var evenCheck = 0
        var oddCheck = 0
        for (i in 0 until n) {
            var tmp = st.nextToken().toInt()
            if (i % 2 == 0) {
                if (tmp % 2 != 0) evenCheck++
            } else {
                if (tmp % 2 == 0) oddCheck++
            }
        }

        if (evenCheck == oddCheck) {
            bw.write("$evenCheck")
        } else {
            bw.write("-1")
        }

        bw.newLine()
    }

    bw.flush()
    bw.close()
}