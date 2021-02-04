package codeforces.practice.year21.jan.under1500

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val m = st.nextToken().toInt()
    var s = st.nextToken().toInt()
    val tmpS = s

    val ans = mutableListOf<Int>()

    while (true) {
        s -= 9
        if (s <= 0) {
            ans.add(9 + s)
            break
        } else {
            ans.add(9)
        }
    }

    if (tmpS == 0) {
        if (m == 1) {
            bw.write("0 0")
        } else {
            bw.write("-1 -1")
        }
    } else if (ans.size < m) {
        bw.write("1")
        repeat(m - ans.size - 1) {
            bw.write("0")
        }
        bw.write("${ans.last() - 1}")
        for (i in ans.size - 2 downTo 0) {
            bw.write("${ans[i]}")
        }

        bw.write(" ")

        ans.forEach { bw.write("$it") }
        repeat(m - ans.size) {
            bw.write("0")
        }
    } else if (ans.size == m) {
        ans.reversed().forEach { bw.write("$it") }
        bw.write(" ")
        ans.forEach { bw.write("$it") }
    } else {
        bw.write("-1 -1")
    }

    bw.flush()
    bw.close()
}