package practice.baekjoon.section9

import java.io.*
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = ArrayList<Int>(n)

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        val tmp = st.nextToken().toInt()
        arr.add(tmp)
    }

    var cnt = 0
    for (i in arr) {
        for (j in 2..arr.max()!!) {
            if (i % j == 0 && i != j) {
                cnt++
                break
            }
        }
    }

    if (1 in arr) cnt++

    bw.write("${n - cnt}")
    bw.flush()
    bw.close()
}