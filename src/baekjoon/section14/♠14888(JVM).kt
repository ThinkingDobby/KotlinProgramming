package practice.baekjoon.section13

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val st1 = StringTokenizer(br.readLine())
    val arr = Array(n) { 0 }
    val operator = Array(4) { 0 }
    repeat(n) {
        arr[it] = st1.nextToken().toInt()
    }

    val st2 = StringTokenizer(br.readLine())
    for (i in 0..3) {
        operator[i] = st2.nextToken().toInt()
    }

    var min = 100000000     // 문제에 제시된 범위
    var max = -100000000

    fun func(now: Int, _total: Int) {
        var total = _total
        if (operator.sum() == 0) {  // 남아있는 연산자가 없는 경우
            if (total > max) max = total    // 브루트포스 - 모든 값 구해가며 비교
            if (total < min) min = total
            return
        }
        for (i in 0..3) {
            if (operator[i] == 0) continue
            when (i) {
                0 -> {
                    total += arr[now + 1]
                    operator[i]--   // 연산자 사용하면 사용했음을 나타냄
                    func(now + 1, total)
                    total = _total  // 아닐 경우 원상 복구
                    operator[i]++
                }
                1 -> {
                    total -= arr[now + 1]
                    operator[i]--
                    func(now + 1, total)
                    total = _total
                    operator[i]++
                }
                2 -> {
                    total *= arr[now + 1]
                    operator[i]--
                    func(now + 1, total)
                    total = _total
                    operator[i]++
                }
                3 -> {
                    total /= arr[now + 1]
                    operator[i]--
                    func(now + 1, total)
                    total = _total
                    operator[i]++
                }
            }
        }
    }

    func(0, arr[0])
    bw.write("$max\n$min")

    bw.flush()
    bw.close()
}