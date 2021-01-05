package baekjoon.section15

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    val arr = Array(n) { st.nextToken().toInt() }
    arr.sort()

    var ans = 0
    var tmp = 0
    for (i in 0 until n) {
        ans += tmp + arr[i]
        tmp += arr[i]
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}