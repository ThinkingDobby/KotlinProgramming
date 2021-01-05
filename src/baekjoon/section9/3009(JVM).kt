package practice.baekjoon.section9

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val x1 = st1.nextToken().toInt()
    val y1 = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val x2 = st2.nextToken().toInt()
    val y2 = st2.nextToken().toInt()

    val st3 = StringTokenizer(br.readLine())
    val x3 = st3.nextToken().toInt()
    val y3 = st3.nextToken().toInt()

    val x4: Int
    val y4: Int

    x4 = if (x1 != x2 && x1 != x3) x1
    else if (x1 == x2) x3
    else x2
    y4 = if (y1 != y2 && y1 != y3) y1
    else if (y1 == y2) y3
    else y2

    bw.write("$x4 $y4")
    bw.flush()
    bw.close()
}