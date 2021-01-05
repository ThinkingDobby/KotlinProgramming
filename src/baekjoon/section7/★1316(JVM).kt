package practice.baekjoon.section7

import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var ans = 0
    repeat(n) {
        val arr = ArrayList<Char>(26)   // 블랙리스트
        val input = br.readLine()
        var tmp = true

        for (i in 0 until input.length - 1) {
            if (input[i] != input[i + 1]) {
                if (!arr.contains(input[i])) {  // 블랙리스트에 기록되지 않은 요소
                    arr.add(input[i])   // 블랙리스트에 기록
                    if (arr.contains(input.last())) tmp = false // 반복문 조건 내 input 의 마지막 항 생략되어 있으므로 따로 처리
                } else tmp = false  // 블랙리스트에 기록된 요소가 다시 나오면 false 반환
            }   // n항과 n-1항이 같은 경우 그냥 넘어감
        }
        if (tmp) ans++
    }

    bw.write("$ans")
    bw.flush()
    bw.close()
}