package programmers.practice.greedy

import java.io.*

class Solution1 {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val memo = Array(n + 1) { 1 }
        lost.forEach { memo[it]-- }
        reserve.forEach { memo[it]++ }

        for (i in 1..n) {
            if (memo[i] == 0) {
                if (i == 1) {
                    if (memo[i + 1] > 1) {
                        memo[i + 1]--
                        memo[i]++
                    }
                } else if (i == n) {
                    if (memo[i - 1] > 1) {
                        memo[i - 1]--
                        memo[i]++
                    }
                } else {
                    if (memo[i - 1] > 1) {
                        memo[i - 1]--
                        memo[i]++
                    } else if (memo[i + 1] > 1) {
                        memo[i + 1]--
                        memo[i]++
                    }
                }
            }
        }

        return n - memo.count{it == 0}
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}