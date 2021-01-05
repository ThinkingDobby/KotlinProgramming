package atcoder.contests.realtime.beginner_187

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val votes = mutableListOf<Pair<Long, Long>>()
    var sum = 0L
    repeat(n) {
        val st = StringTokenizer(br.readLine())
        val tmp = st.nextToken().toLong()
        votes.add(tmp to st.nextToken().toLong())
        sum += tmp
    }

    var total = 0L
    val sortedVotes = votes.sortedByDescending { 2 *  it.first + it.second }    // 배열 정렬 시 자료형이 계산에 영향
    for (i in 0 until n) {
        if (total > sum) {
            println("$i")
            return
        }
        total += sortedVotes[i].first + sortedVotes[i].second
        sum -= sortedVotes[i].first
    }
    println(n)
}