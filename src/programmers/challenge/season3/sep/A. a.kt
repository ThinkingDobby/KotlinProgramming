package programmers.challenge.season3.sep

import java.io.*

class Solution {
    val check = Array(10){false}
    fun solution(numbers: IntArray): Int {
        var sum = 0
        for (i in numbers) check[i] = true
        for (i in check.indices) if (!check[i])sum += i
        return sum
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}