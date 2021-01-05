package codeforces.practice.year20.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val xArray = Array(n) { 0 }
    val yArray = Array(n) { 0 }
    val zArray = Array(n) { 0 }

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine())
        xArray[i] = st.nextToken().toInt()
        yArray[i] = st.nextToken().toInt()
        zArray[i] = st.nextToken().toInt()
    }

    if (xArray.sum() == 0 && yArray.sum() == 0 && zArray.sum() == 0) bw.write("YES")
    else bw.write("NO")

    bw.flush()
    bw.close()
}