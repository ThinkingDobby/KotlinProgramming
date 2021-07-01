package codeforces.practice.year21.may.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val st1 = StringTokenizer(br.readLine())
        val n = st1.nextToken().toInt()
        val x = st1.nextToken().toInt()

        val st2 = StringTokenizer(br.readLine())
        var oddsCount = 0
        var evensCount = 0
        for (i in 0 until n) {
            val tmp = st2.nextToken().toInt()
            if (tmp % 2 == 0) evensCount++
            else oddsCount++
        }

        var ans = false
        if (oddsCount != 0 && !(evensCount == 0 && x % 2 == 0)) {
            if (oddsCount % 2 == 0 && oddsCount != 0) oddsCount -= 1
            if (evensCount + oddsCount >= x) ans = true
        }

        if (ans) bw.write("Yes")
        else bw.write("No")

        bw.newLine()
    }

    bw.flush()
    bw.close()
}
