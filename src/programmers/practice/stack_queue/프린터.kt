package programmers.practice.stack_queue

import java.io.*
import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val memo = mutableListOf<Int>()

        val q = LinkedList<Pair<Int, Int>>()
        for (i in priorities.indices) q.add(priorities[i] to i)
        while (true) {
            val tmp = q.poll()
            if (q.isNotEmpty()) {
                if (q.any{it.first > tmp.first}) q.add(tmp)
                else memo.add(tmp.second)
            } else {
                memo.add(tmp.second)
                break
            }
        }

        return memo.indexOf(location) + 1
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val sol = Solution()
    val ans = sol.solution(intArrayOf(2, 1, 3, 2), 2)
    println(ans)
}