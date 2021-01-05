package practice.baekjoon.etc.bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    var sum = 0
    for (i in 0 until 5) {
        val num = st.nextToken().toInt()
        sum += num * num
    }

    bw.write("${sum % 10}")
    bw.flush()
    bw.close()
}