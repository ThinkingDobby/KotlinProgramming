package baekjoon.section6

import java.io.*

fun han(i: Int): Boolean {  // 한수인지(true) 아닌지(false) 판단
    return if (i < 100) true    // 100보다 작은 수 -> 비교 대상이 없으므로 한수 취급
    else if (i == 1000) false   // 1000 -> 한수x, 3칸 배열을 생성하므로 분류해서 처리, 문제에 1000이하의 수 입력으로 제시
    else {
        val arr = Array(3) { 0 }
        var tmp = i
        repeat(3) {
            arr[it] = tmp % 10
            tmp /= 10
        }
        arr[0] - arr[1] == arr[1] - arr[2]  // Boolean 값 반환
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()!!.toInt()

    var cnt = 0
    for (i in 1..n) if (han(i)) cnt++

    bw.write("$cnt")

    bw.flush()
    bw.close()
}