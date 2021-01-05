package practice.baekjoon.section9

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()

        if (a == 0 && b == 0 && c == 0) break

        val ans = right(a, b, c)
        bw.write("$ans\n")
    }

    bw.flush()
    bw.close()
}

fun right(a: Int, b: Int, c: Int): String {
    val arr = arrayOf(a, b, c)
    val max = arr.max()!!

    var sum = 0
    for (i in arr) {
        if (i != max) sum += i * i
    }
    return if (max * max == sum) "right" else "wrong"
}