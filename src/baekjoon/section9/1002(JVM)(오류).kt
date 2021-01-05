package baekjoon.section9

import java.io.*
import java.util.*
import kotlin.math.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    for (i in 0 until t) {
        val st = StringTokenizer(br.readLine())
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val r1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        val r2 = st.nextToken().toInt()

        val dist = sqrt((x2 - x1).toDouble().pow(2) + (y2 - y1).toDouble().pow(2)).toInt()

        val ans = if (x1 == x2 && y1 == y2 && r1 == r2) -1
        else if (dist == r1 + r2 || dist == abs(r1 - r2)) 1
        else if (dist > r1 + r2 || x1 == x2 && y1 == y2 && r1 != r2 || dist < abs(r1 -r2)) 0
        else 2

        bw.write("$ans\n")
    }

    bw.flush()
    bw.close()
}