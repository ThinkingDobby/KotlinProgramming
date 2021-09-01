package programmers.practice.hash

import java.io.*

class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        return plays.withIndex().groupBy { genres[it.index] }.values
                .sortedByDescending { v -> v.sumBy { it.value } }
                .map { v -> v.sortedByDescending { it.value }.map { it.index } }
                .fold(intArrayOf()) { acc, v -> acc + v.subList(0, minOf(2, v.size)) }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}