package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val st1 = StringTokenizer(br.readLine())
        val candies = Array(n) { st1.nextToken().toInt() }
        val st2 = StringTokenizer(br.readLine())
        val oranges = Array(n) { st2.nextToken().toInt() }

        val candyMin = candies.min()!!
        val orangeMin = oranges.min()!!

        var ans = 0L
        for (i in 0 until n) {
            ans += Math.max(candies[i] - candyMin, oranges[i] - orangeMin)
        }

        bw.write("$ans")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}