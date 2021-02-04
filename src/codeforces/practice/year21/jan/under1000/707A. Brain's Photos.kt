package codeforces.practice.year21.jan.under1000

import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val st1 = StringTokenizer(br.readLine())
    val n = st1.nextToken().toInt()
    val m = st1.nextToken().toInt()

    for (i in 0 until n) {
        val st2 = StringTokenizer(br.readLine())
        for (j in 0 until m) {
            val tmp = st2.nextToken()
            if (tmp == "C" || tmp == "M" || tmp == "Y") {
                println("#Color")
                exitProcess(0)
            }
        }
    }

    println("#Black&White")
}