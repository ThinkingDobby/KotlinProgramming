package programmers.practice.dfs_bfs

import java.io.*

class Solution1 {
    lateinit var numbers: IntArray
    var count = 0

    fun solution1(_numbers: IntArray, target: Int): Int {
        numbers = _numbers
        dfs(0, 0, target)

        return count
    }

    fun dfs(i: Int, sum: Int, target: Int) {
        if (i == numbers.size) {
            if (target == sum) count++
            return
        }
        dfs(i + 1, sum + numbers[i], target)
        dfs(i + 1, sum - numbers[i], target)
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val solution1 = Solution1()

}