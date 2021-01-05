package atcoder.contests.realtime.beginner_187

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val notClean = mutableSetOf<String>()
    val clean = mutableSetOf<String>()
    repeat(n) {
        val input = br.readLine()
        if (input[0] == '!') {
            notClean.add(input.substring(1))
        } else {
            clean.add(input)
        }
    }

    var ans = true
    for (i in clean) {      // set 을 사용해 검색 횟수를 줄임
        if (i in notClean) {
            println(i)
            return
        }
    }

    println("satisfiable")
}