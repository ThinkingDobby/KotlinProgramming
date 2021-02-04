package atcoder.practice.abc_c

import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val st1 = StringTokenizer(br.readLine())
    val r1 = st1.nextToken().toInt()
    val c1 = st1.nextToken().toInt()

    val st2 = StringTokenizer(br.readLine())
    val r2 = st2.nextToken().toInt()
    val c2 = st2.nextToken().toInt()

    if (r1 == r2 && c1 == c2) println(0)
    else if (r1 + c1 == r2 + c2 || r1 - c1 == r2 - c2 || Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 3) println(1)
    else if ((r1 + c1 + r2 - c2) % 2 == 0) println(2)
    else {
        for (i in -3 until 4) {
            for (j in -3 until 4) {
                if (Math.abs(i) + Math.abs(j) > 3) continue
                val r = r1 + i
                val c = c1 + j
                if (r + c == r2 + c2 || r - c == r2 - c2 || Math.abs(r - r2) + Math.abs(c - c2) <= 3) {
                    println(2)
                    exitProcess(0)
                }
            }
        }
        println(3)
    }
}