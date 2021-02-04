package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st1 = StringTokenizer(br.readLine())
    val boys = Array(n) { st1.nextToken().toInt() }.sorted().toMutableList()

    val m = br.readLine().toInt()
    val st2 = StringTokenizer(br.readLine())
    val girls = Array(m) { st2.nextToken().toInt() }.sorted().toMutableList()

    var ans = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (Math.abs(boys[i] - girls[j]) <= 1) {
                girls[j] = -1
                ans++
                break
            }
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}