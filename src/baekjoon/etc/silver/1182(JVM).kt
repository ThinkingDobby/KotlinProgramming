package practice.baekjoon.etc.silver

import java.io.*
import java.util.*

private var n = 0
private var s = 0
private var cnt = 0
lateinit var arr: Array<Int>

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st1 = StringTokenizer(br.readLine())
    n = st1.nextToken().toInt()
    s = st1.nextToken().toInt()

    arr = Array(n){0}
    val st2 = StringTokenizer(br.readLine())
    for (i in 0 until n)
        arr[i] = st2.nextToken().toInt()

    func(0, 0)
    if (s == 0) cnt--
    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun func(now: Int, sum: Int) {  // 더하는 경우와 더하지 않는 경우에 대한 모든 경우 수 계산 - 브루트포스
    if (now == n) {
        if (sum == s) cnt++
        return
    }
    func(now + 1, sum)  // 더하는 경우
    func(now + 1, sum + arr[now])   // 더하지 않는 경우
}