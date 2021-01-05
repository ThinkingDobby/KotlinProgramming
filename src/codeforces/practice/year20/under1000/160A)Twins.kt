package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val coins = Array(n) { st.nextToken().toInt() }

    coins.sortDescending()

    var sum = 0
    var count = 0
    for (i in 0 until n) {
        sum += coins[i]
        count++
        if (sum > coins.sum() / 2) {
            break
        }
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}