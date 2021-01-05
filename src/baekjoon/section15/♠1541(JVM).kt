package baekjoon.section15

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine()

    val numbers = mutableListOf<Int>()
    val operators = mutableListOf<Char>()

    var tmp: String? = ""

    for (i in input.indices) {
        if (input[i] == '-' || input[i] == '+') {
            operators.add(input[i])
            numbers.add(tmp!!.toInt())
            tmp = ""
        } else {
            tmp += input[i]
        }
    }
    numbers.add(tmp!!.toInt())

    var tmp2 = -1
    for (i in operators.indices) {
        if (operators[i] == '-') {
            tmp2 = i
            break
        }
    }

    var ans = 0
    if (tmp2 == -1) {
        ans = numbers.sum()
    } else {
        for (i in 0 until tmp2 + 1) {
            ans += numbers[i]
        }
        for (i in tmp2 + 1 until numbers.size) {
            ans -= numbers[i]
        }
    }

    bw.write("$ans")

    bw.flush()
    bw.close()
}