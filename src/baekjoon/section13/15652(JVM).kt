package practice.baekjoon.section13

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val arr = Array(m) { 0 }
    val isUsed = Array(n + 1) { false }

    fun func(k: Int, tmp: Int, _prev: Int) {
        var prev = _prev
        if (k == m) {
            arr.forEach { bw.write("$it ") }
            bw.newLine()
            isUsed[tmp] = true
            return
        }
        for (i in 1..n) {
            if (i < prev) continue
            arr[k] = i
            prev = i
            func(k + 1, i, prev)
            isUsed.fill(false)
        }
    }

    func(0, -1, -1)

    bw.flush()
    bw.close()
}