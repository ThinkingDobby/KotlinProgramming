package practice.baekjoon.section13

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val isUsed1 = Array(n) { false }
    val isUsed2 = Array(n * 2) { false }
    val isUsed3 = Array(n * 2) { false }

    var cnt = 0

    fun func(now: Int) {
        if (now == n) {
            cnt++
            return
        }
        for (i in 0 until n) {
            if (isUsed1[i] || isUsed2[i + now] || isUsed3[now - i + n - 1]) continue
            isUsed1[i] = true
            isUsed2[i + now] = true
            isUsed3[now - i + n - 1] = true
            func(now + 1)
            isUsed1[i] = false
            isUsed2[i + now] = false
            isUsed3[now - i + n - 1] = false
        }
    }

    func(0)

    bw.write("$cnt")

    bw.flush()
    bw.close()
}