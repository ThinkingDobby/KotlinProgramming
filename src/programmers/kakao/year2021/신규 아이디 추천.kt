package programmers.kakao.year2021

import java.io.*

class Solution1 {
    fun solution(new_id: String): String {
        val temp = new_id.toCharArray()
        var three = temp.map{it.toLowerCase()}.filter{it.toInt() in 97..122 || it.toInt() in 48..57 || it == '-' || it == '_' || it == '.'}
                .joinToString("").replace("\\.+".toRegex(), ".")
        if (three[0] == '.') three = three.removeRange(0..0)
        if (three.isNotEmpty()) {
            if (three.last() == '.') three = three.removeRange(three.length - 1..three.length - 1)
        }
        if (three.isEmpty()) three = "a"
        if (three.length > 15) three = three.removeRange(15..three.length - 1)
        if (three.last() == '.') three = three.removeRange(three.length - 1..three.length - 1)
        if (three.length < 3) {
            val last = three.last()
            while (three.length != 3) {
                three += last
            }
        }

        return three
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    val tmp = charArrayOf('a', 'b', 'c')
    println(tmp.toString())
    println(tmp.joinToString(""))
}