package programmers.practice.stack_queue

import java.io.*

class Solution1 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = mutableListOf<Int>()

        val new = (progresses.indices).map { (100 - progresses[it] + speeds[it] - 1) / speeds[it]}

        var now = new[0]
        var cnt = 1
        for (i in 1 until new.size) {
            if (now >= new[i]) cnt++
            else {
                answer.add(cnt)
                now = new[i]
                cnt = 1
            }
        }
        answer.add(cnt)

        return answer.toIntArray()
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}