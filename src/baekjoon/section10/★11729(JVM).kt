package baekjoon.section10

import java.io.*

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    var k = 2
    repeat(n - 1) {
        k *= 2
    }
    bw.write("${k - 1}\n")
    hanoi(n, 1, 2, 3)

    bw.flush()
    bw.close()
}

fun hanoi(n: Int, from: Int, other: Int, to: Int) {
    if (n <= 0) return                  // 5개 기준으로
    hanoi(n - 1, from, to, other)   // 위 4개를 1번에서 2번으로 옮겨야 맨 밑 판을 3번으로 옮길 수 있음
    bw.write("$from $to\n")         // 어디에서 어디로 (가장 깊숙히 있는 재귀함수에서 출력하게 됨)
    hanoi(n - 1, other, from, to)   // 맨 밑에 것 3 번으로 옮겼다 치고, 2번에 옮겨놓은 4개를 3번으로 옯겨 마무리
}