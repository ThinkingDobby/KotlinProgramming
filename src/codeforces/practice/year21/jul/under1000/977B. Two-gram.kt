package codeforces.practice.year21.jul.under1000

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val memo = mutableMapOf<String, Int>()

    val input = br.readLine()
    for (i in 1 until n) {
        val temp = input.substring(i - 1..i)
        if (temp !in memo) {
            memo[temp] = 1
        } else {
            memo[temp] = memo[temp]!! + 1
        }
    }

    var max = Int.MIN_VALUE
    var maxKey = ""
    for (i in memo.keys) {
        if (memo[i]!! > max) {
            max = memo[i]!!
            maxKey = i
        }
    }

    bw.write("$maxKey")

    bw.flush()
    bw.close()
}
