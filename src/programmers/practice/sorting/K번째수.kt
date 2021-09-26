package programmers.practice.sorting

import java.io.*

class Solution1 {
    fun solution(array: IntArray, commands: Array<IntArray>): MutableList<Int> {
        val ans = mutableListOf<Int>()
        for (t in commands) {
            val (i, j, k) = t
            ans.add(array.toMutableList().subList(i - 1, j).sorted()[k - 1])
        }
        return ans
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}