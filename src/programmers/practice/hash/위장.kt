package programmers.practice.hash

import java.io.*

class Solution1 {
    fun solution(clothes: Array<Array<String>>): Int {
        val memo = HashMap<String, Int>()

        for (i in clothes) {
            memo[i[1]] = (memo[i[1]] ?: 0) + 1
        }

        val ans = memo.values.fold(1){total, now -> total * (now + 1)}

        return ans - 1
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}