package programmers.practice.greedy

import java.io.*

class Solution2 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var ans = n
        val lostSet = lost.toSet() - reserve.toSet()
        val reserveSet = (reserve.toSet() - lost.toSet()).toMutableSet()

        for (i in lostSet) {
            when {
                i + 1 in reserveSet -> reserveSet.remove(i + 1)
                i - 1 in reserveSet -> reserveSet.remove(i - 1)
                else -> ans--
            }
        }

        return ans
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}