package codeforces.practice.year21.feb.under1000

import java.io.*
import java.util.*
import kotlin.system.exitProcess

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = br.readLine()
    val rank = input[0]
    val suit = input[1]

    val st = StringTokenizer(br.readLine())
    repeat(5) {
        val tmp = st.nextToken()
        if (tmp[0] == rank || tmp[1] == suit) {
            println("YES")
            exitProcess(0)
        }
    }

    println("NO")
}