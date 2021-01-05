package practice.baekjoon.etc.bronze

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = ArrayList<Int>(8)

    val st = StringTokenizer(br.readLine())

    for (i in 0 until 8) {
        val tmp = st.nextToken().toInt()
        arr.add(tmp)
    }

    var cnt = 0
    for (i in 0 until 8) {
        if (arr[i] == i + 1) cnt++
        else if (arr[i] == 8 - i) cnt--
    }

    when (cnt) {
        8 -> bw.write("ascending")
        -8 -> bw.write("descending")
        else -> bw.write("mixed")
    }

    bw.flush()
    bw.close()
}