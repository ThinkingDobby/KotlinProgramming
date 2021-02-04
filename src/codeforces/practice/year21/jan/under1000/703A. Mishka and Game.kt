package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var firstCount = 0
    var secondCount = 0
    repeat(n) {
        val st = StringTokenizer(br.readLine())

        val first = st.nextToken().toInt()
        val second = st.nextToken().toInt()

        if (first > second) firstCount++
        if (second > first) secondCount++
    }

    if (firstCount > secondCount) {
        bw.write("Mishka")
    } else if (secondCount > firstCount) {
        bw.write("Chris")
    } else {
        bw.write("Friendship is magic!^^")
    }

    bw.flush()
    bw.close()
}