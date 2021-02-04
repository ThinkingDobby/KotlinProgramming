package atcoder.contests.realtime.beginner_190

import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val s = st1.nextToken().toLong()
    val d = st1.nextToken().toLong()

    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        val x = st2.nextToken().toLong()
        val y = st2.nextToken().toLong()

        if (x < s && y > d) {
            println("Yes")
            exitProcess(0)
        }
    }

    println("No")
}