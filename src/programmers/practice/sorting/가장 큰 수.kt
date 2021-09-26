package programmers.practice.sorting

import java.io.*

class Solution2 {
    fun solution(numbers: IntArray) =
            numbers.map{it.toString()}.sortedWith(Comparator { o1, o2 ->
                when {
                    o1.length == o2.length -> o2.compareTo(o1)
                    else -> (o2 + o1).compareTo(o1 + o2)
                }
            }).let{ a -> if (a.all{it == "0"}) return "0" else a }.joinToString("")
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

}