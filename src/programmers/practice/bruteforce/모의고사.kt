package programmers.practice.bruteforce

import java.io.*

class Solution1 {
    val first = Array(10000){it % 5 + 1}
    val second = Array(10000){
        if (it % 2 == 0) 2
        else if (it % 8 == 1) 1
        else if (it % 8 == 3) 3
        else if (it % 8 == 5) 4
        else 5
    }
    val third = Array(10000) {
        when (it % 10) {
            in 0..1 -> 3
            in 2..3 -> 1
            in 4..5 -> 2
            in 6..7 -> 4
            else -> 5
        }
    }

    fun solution(answers: IntArray): MutableList<Int> {
        var answer = mutableListOf<Int>()

        val cnt = Array(3){0}

        for (i in answers.indices) {
            if (answers[i] == first[i]) cnt[0]++
            if (answers[i] == second[i]) cnt[1]++
            if (answers[i] == third[i]) cnt[2]++
        }

        val max = cnt.max()
        cnt.forEachIndexed {idx, v -> if (v == max) answer.add(idx + 1) }

        return answer
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = Solution1()
    val ans = input.solution(br.readLine().split(" ").map{it.toInt()}.toIntArray())
    bw.write("$ans")
}