package practice.baekjoon.etc.gold

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    var p1x = st1.nextToken().toInt()
    var p1y = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    var p2x = st2.nextToken().toInt()
    var p2y = st2.nextToken().toInt()

    val st3 = StringTokenizer(br.readLine())
    var p3x = st3.nextToken().toInt()
    var p3y = st3.nextToken().toInt()

    val grad1 = (p2y - p1y) / (p2x - p1x)
    val grad2 = (p3y - p2y) / (p3x - p2x)

    p3y -= p2y

    val ans: Int

    ans = when {
        grad1 == grad2 -> 0
        grad1 > 0 -> judge1(grad1, grad2, p3y)
        grad1 < 0 -> judge2(grad1, grad2, p3y)
        else -> judge3(p2x - p1x, p3y)
    }


    bw.write("$ans")
    bw.flush()
    bw.close()
}

fun judge1 (grad1: Int, grad2: Int, p3y: Int): Int {
    return if (grad2 < 0) {
        if (p3y > 0) 1
        else -1
    } else if (grad2 > grad1) {
        if (p3y > 0) 1 else -1
    } else -1
}

fun judge2 (grad1: Int, grad2: Int, p3y: Int): Int {
    return if (grad2 > 0) {
        if (p3y > 0) 1
        else -1
    } else if (grad2 > grad1) {
        if (p3y < 0) 1 else -1
    } else 1
}

fun judge3 (tmp: Int, p3y: Int): Int {
    return if (tmp > 0) {
        if (p3y > 0) 1
        else -1
    } else {
        if (p3y < 0) -1
        else 0
    }
}