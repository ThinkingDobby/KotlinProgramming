package codeforces.practice.year21.jan

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    val minArray = Array(48) { it * 5 }

    var count = 0
    var sum = 0
    for (i in 1 until minArray.size) {
        sum += minArray[i]
        if (240 - k < sum || count == n) break
        count++
    }

    bw.write("$count")

    bw.flush()
    bw.close()
}