package codeforces.practice.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var max = 0
    val st = StringTokenizer(br.readLine())
    val firstArr = Array(n + 1) { 0 }
    for (i in 1..n) {
        firstArr[i] = st.nextToken().toInt()
        if (firstArr[i] > max) max = firstArr[i]
    }

    val secondArr = Array(max + 1) { 0 }
    for (i in 1..n) {
        for (j in 1..firstArr[i]) {
            secondArr[j]++
        }
    }

    val thirdArr = Array(n + 1) {0}
    for (i in 1..max) {
        for (j in n downTo n - secondArr[i] + 1) {
            thirdArr[j]++
        }
    }

    for (i in 1..n) {
        bw.write("${thirdArr[i]} ")
    }

    bw.flush()
    bw.close()
}