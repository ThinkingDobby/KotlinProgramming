package practice.baekjoon.etc.gold

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    val p1x = st1.nextToken().toInt()
    val p1y = st1.nextToken().toInt()
    val p1 = Point(p1x, p1y)

    val st2 = StringTokenizer(br.readLine())
    val p2x = st2.nextToken().toInt()
    val p2y = st2.nextToken().toInt()
    val p2 = Point(p2x, p2y)

    val st3 = StringTokenizer(br.readLine())
    val p3x = st3.nextToken().toInt()
    val p3y = st3.nextToken().toInt()
    val p3 = Point(p3x, p3y)

    bw.write("${ccw(p1, p2, p3)}")
    bw.flush()
    bw.close()
}

class Point(val x: Int, val y: Int)

fun ccw(a: Point, b: Point, c: Point): Int {
    val result = a.x * b.y + b.x * c.y + c.x * a.y - (a.y * b.x + b.y * c.x + c.y * a.x)
    return when {
        result > 0 -> 1
        result < 0 -> -1
        else -> 0
    }
}