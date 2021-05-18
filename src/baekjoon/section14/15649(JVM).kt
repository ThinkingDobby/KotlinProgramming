package practice.baekjoon.section13

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val arr = Array(m){0}
    val isUsed = Array(n + 1) { false }

    fun func(k: Int) {
        if (k == m) {
            arr.forEach { bw.write("$it ") }
            bw.newLine()
            return
        }
        for (i in 1..n) {
            if (!isUsed[i]) {
                arr[k] = i
                isUsed[i] = true
                func(k + 1)
                isUsed[i] = false
            }
        }
    }

    func(0)

    bw.flush()
    bw.close()
}