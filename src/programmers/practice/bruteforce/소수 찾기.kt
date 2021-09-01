package programmers.practice.bruteforce

import java.io.*

class Solution2 {
    lateinit var check: BooleanArray
    lateinit var primeCheck: Array<Boolean>
    lateinit var ans: MutableSet<Int>

    fun solution(numbers: String): Int {
        check = BooleanArray(numbers.length)
        primeCheck = era(10000000)

        ans = mutableSetOf<Int>()

        perm(0, "", numbers)
        println(ans)

        return ans.size
    }

    fun era(n: Int): Array<Boolean> {
        val primeNumbers = Array(n + 1) { true }
        primeNumbers[0] = false
        primeNumbers[1] = false

        for (i in 2..n) {
            if (primeNumbers[i]) {
                for (j in 2 * i..n step i) primeNumbers[j] = false
            }
        }

        return primeNumbers
    }

    fun perm(depth: Int, makeStr: String, numbers: String) {
        if (depth == numbers.length) {
            if (makeStr.equals("")) return
            if (primeCheck[makeStr.toInt()]) {
                ans.add(makeStr.toInt())
            }
            return
        }
        for (i in numbers.indices) {
            if (!check[i]) {
                check[i] = true
                perm(depth + 1, makeStr+numbers[i], numbers)
                check[i] = false
                perm(depth+1, makeStr, numbers)
            }
        }
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sol = Solution2()
    val input = br.readLine()
    bw.write("${sol.solution("$input")}")

    bw.flush()
    bw.close()
}