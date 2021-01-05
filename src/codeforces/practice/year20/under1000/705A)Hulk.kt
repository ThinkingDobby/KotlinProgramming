package codeforces.practice.under1000

import java.io.*
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    val sb = StringBuilder()
    sb.append("I hate ")

    var hate = true
    repeat(n - 1) {
        if (hate) {
            sb.append("that I love ")
            hate = false
        } else {
            sb.append("that I hate ")
            hate = true
        }
    }

    sb.append("it")

    println(sb)
}